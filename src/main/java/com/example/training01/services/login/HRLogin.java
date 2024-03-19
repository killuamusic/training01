package com.example.training01.services.login;


import com.example.training01.model.HrData.HRData;
import com.example.training01.model.login.UserData;
import com.example.training01.model.login.UserLogin;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@Service
public class HRLogin {

    public String checkHRLogin(UserLogin login) {

        String res = "";

        if (login == null) {
            res = "null";
        } else if (login.getUName() == null || login.getUName().equalsIgnoreCase("")) {
            res = "no_user";
        } else if (login.getUPass() == null || login.getUPass().equalsIgnoreCase("")) {
            res = "no_pass";
        } else if (login.getUName().equalsIgnoreCase("pa") && login.getUPass().equalsIgnoreCase("01")) {
            res = "ok";
        } else {
            res = "no_login";
        }

//        if (login == null) {
//            return "Error login=null";
//        }
//        if (login.getUName() == null || login.getUName().equals("")) {
//            return "Error user=null";
//        }
//        if (login.getUPass() == null || login.getUPass().equals("")) {
//            return "Error password=null";
//        }
//        return "login ok \nuser: " + login.getUName() + "\npass: " + login.getUPass();

        return res;
    }

    public UserData testCallUserData() {

        UserData user = new UserData();

        user.setUName("uma");
        user.setFirstname("F1");
        user.setLastname("L1");
        user.setImage("JPG");
        user.setEmail("email e1");
        user.setUID("id000");
        user.setLogin(true);

        return user;
    }

    public UserData callHRLoginAPI(UserLogin login) {

        RestTemplate restTemplate = new RestTemplate();

/*
//        String url = "http://localhost:8080/wel";
//        String url = "https://api.github.com/";
        String url = "http://localhost:8080/logintest";
        String result = restTemplate.getForObject(url, String.class);

//        UserData user = new UserData();

        // 1
//        UserData user = restTemplate.getForObject(url, UserData.class);

        //2
//        ResponseEntity<UserData> responseEntity = restTemplate.getForEntity(url,UserData.class);
//        user = responseEntity.getBody();

        //3
//        ResponseEntity<UserData> responseEntity = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                null,
//                UserData.class
//        );
//        user = responseEntity.getBody();
*/

        String encodeBytes = Base64.getEncoder().encodeToString(login.getUPass().getBytes());
        System.out.println("encodeBytes:" + encodeBytes);
        String api_key = "1dc948a15b5d14ea41cb8028e015fdf2";
        String query_url = "http://truehr2/home/api/hr/loginall?key=" + api_key
                + "&username=" + login.getUName()
                + "&password=AA" + encodeBytes + "BBBB"
                + "&format=json";

        System.out.println("url:" + query_url);

        HRData datajson = restTemplate.getForObject(query_url, HRData.class);

        UserData user = new UserData();

        System.out.println(datajson.getCode());
        System.out.println(datajson.getDescription());

        System.out.println(datajson.getData().getEngfirstname());

        user.setUID(datajson.getData().getEmployeeid());
        user.setUName(datajson.getData().getLoginname());
        user.setFirstname(datajson.getData().getEngfirstname());
        user.setLastname(datajson.getData().getEnglastname());
        user.setImage(datajson.getData().getImage());
        user.setEmail(datajson.getData().getEmail());
        user.setUID(datajson.getData().getEmplid());
        user.setLogin(true);

/*
//        try {
//            url = new URL(query_url);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//
//            conn.setConnectTimeout(5000);
//            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            conn.setRequestMethod("GET");
//
//            OutputStream os = conn.getOutputStream();
//            os.close();
//
//            InputStream in = new BufferedInputStream(conn.getInputStream());
//            String result = IOUtils.toString(in, "UTF-8");
//            System.out.println(result);
//
//            System.out.println("########## Result after Reading JSON Response ##########");
//            JSONObject myResponse = new JSONObject(result);
//            System.out.println("json object:" + myResponse);
//
//            String response_code = String.valueOf(myResponse.get("code"));
//            System.out.println("code- " + response_code);
//
//            if (!response_code.equals("200")) {
//                System.out.println("username or password is not corrected.");
//                System.out.println(myResponse.getString("description"));
//                user.setLogin(false);
//            } else {
//                System.out.println("description- " + myResponse.getString("description"));
//                JSONObject Data = myResponse.getJSONObject("data");
//                System.out.println("engfirstname- " + Data.getString("engfirstname"));
//                System.out.println("englastname- " + Data.getString("englastname"));
//                System.out.println("engpositionname- " + Data.getString("engpositionname"));
//                System.out.println("email- " + Data.getString("email"));
//                System.out.println("loginname- " + Data.getString("loginname"));
//
//                user.setuID(Data.getString("employeeid"));
//                user.setFirstname(Data.getString("engfirstname"));
//                user.setLastname(Data.getString("englastname"));
//                user.setPositionname(Data.getString("engpositionname"));
//                user.setDept(Data.getString("dept"));
//                user.setEmail(Data.getString("email"));
//                user.setImage(Data.getString("image"));
//                user.setLogin(true);
//            }
//
//            in.close();
//            conn.disconnect();
//
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (ProtocolException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
*/

        return user;
    }
}
