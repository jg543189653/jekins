package com.lixin.web.service.impl;

import com.lixin.web.service.CommInfoVoService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/15.
 */
@Service
public class CommInfoVoServiceImpl implements CommInfoVoService {

    public void sayHello(String sayHi){
        System.out.println("------------------"+sayHi+"------------------");
    }

}
