package com.example.training01.controller.login;

import com.example.training01.model.UserLogin;
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
    String submitForm2(@ModelAttribute UserLogin userlogin, ModelMap model) {

        System.out.println("GO : " + userlogin);

        if (userlogin.getUser() == null) {

            model.addAttribute("relogin", "no_user");

            return "login";
        }

        return "home";
    }

}
