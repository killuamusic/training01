package com.example.training01.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CallSimPair {

    @GetMapping("/simpair")
    public String pageSimPair() {
        return "page_sim/simpair";
    }

    @PostMapping("/simpair")
    public String callSimPair(
            @RequestParam("inputsim") String sim,
            @RequestParam("simAPI") String api,
            @RequestParam(value = "inpair", required = false) String msisdn,
            @RequestParam(value = "initemid", required = false) String itemID,
            @RequestParam(value = "indealer", required = false) String dealer,
            @RequestParam(value = "intype", required = false) String simType,
            @RequestParam(value = "insap", required = false) String sap) {

        System.out.println(sim + "|" + api + "|" + msisdn + "|" + itemID + "|" + dealer + "|" + simType + "|" + sap);

        return "page_sim/simpair";
    }

}
