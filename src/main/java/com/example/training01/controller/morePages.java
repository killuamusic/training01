package com.example.training01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class morePages {

    @GetMapping("/test")
    String showTestPage() {
        return "testpage";
    }

    @GetMapping("/lay")
    String showLayout() {
        return "layout/layout";
    }

    @GetMapping("/load1")
    String showload() {
        return "loading";
    }

    @GetMapping("/load2")
    String showload2() {
        return "loading2";
    }

    @GetMapping("/resultdata")
    String showResultData() {
        return "resultdata";
    }

}
