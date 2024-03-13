package com.example.training01.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class login {

    @GetMapping("/login")
    String loginPage() {
        return "login";
    }

    @GetMapping("/test")
    String showTestPage() {
        return "testindex";
    }

    @GetMapping("/header")
    String he(){
//      101  th:fragment="header"
        return "fragment/header";
    }

    @GetMapping("/he2")
    String he2(){
        return "fragment/navigation";
    }
}
