package com.atguigu.paymentdemo;

import com.atguigu.paymentdemo.config.WxPayConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.PrivateKey;

@SpringBootTest
class WeixinPaymentApplicationTests {

    @Autowired
    private WxPayConfig wxPayConfig;

    @Test
    void contextLoads() {
        String keyPath = wxPayConfig.getPrivateKeyPath();
        PrivateKey privateKey = wxPayConfig.getPrivateKey(keyPath);
        System.out.println(privateKey);
    }

}
