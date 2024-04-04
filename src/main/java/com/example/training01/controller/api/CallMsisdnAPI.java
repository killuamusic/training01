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
public class CallMsisdnAPI {

    @GetMapping("/msisdnapi")
    public String pageMsisdnAPI() {
        return "page_msisdn/msisdnapi";
    }

    @PostMapping("/msisdnapi")
    public String callMsisdnAPI(
            @RequestParam("inputmsisdn") String msisdn,
            @RequestParam("msisdnAPI") String api,
            @RequestParam(value = "inpool", required = false) String pool,
            @RequestParam(value = "innote", required = false) String note) {

        System.out.println(msisdn + "|" + api + "|" + pool + "|" + note);

        return "page_msisdn/msisdnapi";
    }

}
