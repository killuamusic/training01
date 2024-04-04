package com.example.training01.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CallSimAll {

    @GetMapping("/simall")
    public String allSimAPI() {
        return "page_sim/simall";
    }

    @PostMapping("/simall")
    public String callAllSimAPI(
            @RequestParam("inputsim") String sim,
            @RequestParam("simAPI") String api,
            @RequestParam(value = "indealer", required = false) String dealer,
            @RequestParam(value = "intype", required = false) String simType,
            @RequestParam(value = "insimnote", required = false) String note) {

        System.out.println(sim + "|" + api + "|" + dealer + "|" + simType + "|" + note);

        return "page_sim/simall";
    }

}
