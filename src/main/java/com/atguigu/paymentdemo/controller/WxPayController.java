package com.atguigu.paymentdemo.controller;

import com.atguigu.paymentdemo.service.WxPayService;
import com.atguigu.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/wx-pay")
@Api(tags = "网站微信支付API")
@Slf4j
public class WxPayController {

    @Autowired
    private WxPayService wxPayService;

    @ApiOperation("调用统一下单API，生成支付二维码")
    @PostMapping("native/{productId}")
    public R nativePay(@PathVariable Long productId) throws Exception {
       log.info("发起支付请求");
       //返回支付二维码链接和订单号
       Map<String,Object> map = wxPayService.nativePay(productId);
       return R.ok().setData(map);
    }
}
