package com.example.training01.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class simlife {

    @GetMapping("/simlife")
    public String pageSimCycle() {
        return "page_sim/simlifecycle";
    }
}
