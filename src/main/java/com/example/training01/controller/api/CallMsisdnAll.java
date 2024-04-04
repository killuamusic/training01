package com.example.training01.controller.api;

import amdocs.rm3g.urm.sessions.interfaces.api.RM1UnifiedResourceManager;
import com.example.demo.services.allAPI.CallMSISDN;
import com.example.demo.services.allAPI.ConnectCallAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CallMsisdnAll {

    @GetMapping("/msisdnall")
    public String showAllMsisdnAPI() {
        return "page_msisdn/msisdnall";
    }

    @PostMapping("/msisdnall")
    public String callAllMsisdnAPI(
            @RequestParam("inmsisdn") String msisdn,
            @RequestParam("optionsAPI") String api,
            @RequestParam(value = "inpool", required = false) String pool,
            @RequestParam(value = "innote", required = false) String note,
            @RequestParam(value = "inatt", required = false) String att) {

        System.out.println(msisdn + "|" + api + "|" + pool + "|" + note + "|" + att);

        return "page_msisdn/msisdnall";
    }

}
