package com.example.training01.controller.login;

import com.example.training01.model.login.UserLogin;
import com.example.training01.services.login.HRLogin;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class login {

    @GetMapping("/login")
    String loginPage(ModelMap model) {

        UserLogin ulog = new UserLogin();

        model.addAttribute("userlogin", ulog);

//        model.addAttribute("noti_m", "Message.");

        return "login";
    }

    @GetMapping("/home")
    String showHeome(HttpSession session) {
        System.out.println("session : " + session.getAttribute("username"));
        return "home";
    }

    @GetMapping("/logout")
    String logout(HttpSession session) {
        // ลบ session attribute ที่เกี่ยวข้องกับการล็อกอินออกไป
//        session.removeAttribute("username");
        // ลบ session ทั้งหมดออกจาก server
        session.invalidate();

        return "redirect:/login";
    }

    @PostMapping("/login")
    String submitForm2(@ModelAttribute("userlogin") UserLogin userlogin, ModelMap model, HttpSession session) {

        System.out.println("GO : " + userlogin);

        HRLogin login = new HRLogin();

        String relogin = login.checkHRLogin(userlogin);

//        model.addAttribute("noti_m", "Message.");

        switch (relogin) {
            case "null":
                model.addAttribute("relogin", "no_user");
                break;
            case "no_user":
                model.addAttribute("relogin", "Please enter a Username.");
                break;
            case "no_pass":
                model.addAttribute("relogin", "Please enter a Password.");
                break;
            case "no_login":
                model.addAttribute("relogin", "You don't have permission to access.");
                break;
            case "ok":
                model.addAttribute("relogin", "ok");
                session.setAttribute("username", "login_ok");
                break;
            default:
                model.addAttribute("relogin", "Error.");
                System.out.println("Unknown String login.");
        }

//        if (userlogin.getUName() == null) {
//            model.addAttribute("relogin", "no_user");
//            return "login";
//        }

//        if (userlogin.getUName().equalsIgnoreCase("")){
//            model.addAttribute("relogin", "Please enter a Username.");
//            return "login";
//        }

//        if (userlogin.getUPass().equalsIgnoreCase("")){
//            model.addAttribute("relogin", "Please enter a Password.");
//            return "login";
//        }

//        if (userlogin.getUName().equalsIgnoreCase("pa") && userlogin.getUPass().equalsIgnoreCase("01")){
//            model.addAttribute("relogin", "ok");
//            return "login";
//        }else {
//            model.addAttribute("relogin", "You don't have permission to access.");
//            return "login";
//        }

        return "login";

    }

}
