package com.mine.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/bank")
public class BankController {


    @GetMapping(path="/bankName")
    public @ResponseBody String getBankName() {
        return "ICICI Bank Limited";
    }

    @GetMapping(path="/bankAddress")
    public @ResponseBody String getBankAddress() {
        return "ICICI Bank Limited,\n" +
                "NEW YORK BRANCH,\n" +
                "575 FIFTH AVE\n" +
                "26TH FLOOR NEW YORK, NY 10017 USA";
    }


}
