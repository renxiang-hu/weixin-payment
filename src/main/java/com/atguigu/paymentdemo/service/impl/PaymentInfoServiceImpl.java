package com.atguigu.paymentdemo.service.impl;

import com.atguigu.paymentdemo.entity.PaymentInfo;
import com.atguigu.paymentdemo.mapper.PaymentInfoMapper;
import com.atguigu.paymentdemo.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
