package com.example.training01.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CallSimSelf {

    @GetMapping("/simself")
    public String pageSimSelf() {
        return "page_sim/simself";
    }

    @PostMapping("/simself")
    public String callSimSelf(
            @RequestParam("inputsim") String sim,
            @RequestParam("simAPI") String api,
            @RequestParam(value = "inpoolid", required = false) String pool,
            @RequestParam(value = "initemid", required = false) String itemID,
            @RequestParam(value = "indealer", required = false) String dealer,
            @RequestParam(value = "intype", required = false) String simType,
            @RequestParam(value = "insap", required = false) String sap,
            @RequestParam(value = "inpp", required = false) String pp,
            @RequestParam(value = "inexp", required = false) String exp) {

        System.out.println(sim + "|" + api + "|" + pool + "|" + itemID + "|"
                + dealer + "|" + simType + "|" + sap + "|" + pp + "|" + exp);

        return "page_sim/simself";
    }

}
