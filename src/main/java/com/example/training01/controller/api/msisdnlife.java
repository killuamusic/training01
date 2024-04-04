package com.example.training01.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class msisdnlife {

    @GetMapping("/msisdnlife")
    public String pageMsisdnCycle() {
        return "page_msisdn/msisdnlifecycle";
    }

}
