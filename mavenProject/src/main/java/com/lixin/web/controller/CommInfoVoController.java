package com.lixin.web.controller;

import com.lixin.web.service.CommInfoVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Administrator on 2018/3/15.
 */
@Controller
public class CommInfoVoController {

    @Autowired
    CommInfoVoService commInfoVoService ;


    @GetMapping(path = "/aftersales")
    public String afterSales(@RequestBody String hiName) {

        System.out.println("------"+hiName+"------");
        this.commInfoVoService.sayHello(hiName);

        return "9999";

    }

}
