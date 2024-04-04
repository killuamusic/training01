package com.example.training01.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CallMsisdnMNP {

    @GetMapping("/msisdnmnp")
    public String pageMsisdnMNP() {
        return "page_msisdn/msisdnmnp";
    }

    @PostMapping("/msisdnmnp")
    public String callMsisdnMNP(@RequestParam("inputmsisdn") String msisdn,
                                @RequestParam("msisdnAPI") String api,
                                @RequestParam(value = "inrcp", required = false) String rcp,
                                @RequestParam(value = "indonoroperator", required = false) String dopt,
                                @RequestParam(value = "indonorzone", required = false) String dzone,
                                @RequestParam(value = "inrcpoperator", required = false) String ropt,
                                @RequestParam(value = "inrcpzone", required = false) String rzone) {

        System.out.println(msisdn + "|" + api + "|" + rcp + "|" + dopt + "|" + dzone + "|" + ropt + "|" + rzone);

        return "page_msisdn/msisdnmnp";
    }

}
