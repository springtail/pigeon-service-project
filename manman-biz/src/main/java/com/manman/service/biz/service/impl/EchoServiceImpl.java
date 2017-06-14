package com.manman.service.biz.service.impl;


import com.manman.service.api.service.EchoService;
import org.springframework.stereotype.Service;

/**
 * Created by chenyazheng on 2017/4/18.
 */
@Service("echoService")
public class EchoServiceImpl implements EchoService {

    @Override
    public String Hello() {

        return "hello method";
    }
}
