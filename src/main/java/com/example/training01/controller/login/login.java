package com.example.training01.controller.login;

import com.example.training01.model.login.UserLogin;
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

    @GetMapping("/test")
    String showTestPage() {
        return "testpage";
    }

    @GetMapping("/lay")
    String showLayout() {
        return "layout/layout";
    }

    @GetMapping("/home")
    String showHeome() {
        return "home";
    }

    @GetMapping("/l1")
    String showload() {
        return "loading";
    }

    @GetMapping("/l2")
    String showload2() {
        return "loading2";
    }

    @PostMapping("/login")
    String submitForm2(@ModelAttribute("userlogin") UserLogin userlogin, ModelMap model) {

        System.out.println("GO : " + userlogin);

//        model.addAttribute("noti_m", "Message.");

        if (userlogin.getUser() == null) {

            model.addAttribute("relogin", "no_user");

            return "login";
        }

        if (userlogin.getUser().equalsIgnoreCase("")){

            model.addAttribute("relogin", "Please enter a Username.");

            return "login";
        }

        if (userlogin.getPass().equalsIgnoreCase("")){

            model.addAttribute("relogin", "Please enter a Password.");

            return "login";
        }

        if (userlogin.getUser().equalsIgnoreCase("pa") && userlogin.getPass().equalsIgnoreCase("01")){

            model.addAttribute("relogin", "ok");

            return "login";
        }else {
            model.addAttribute("relogin", "You don't have permission to access.");

            return "login";
        }

    }

}
