package com.example.training01.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultAPI {

    @GetMapping("/resultdata")
    String showResultData() {
        return "resultdata";
    }

}
