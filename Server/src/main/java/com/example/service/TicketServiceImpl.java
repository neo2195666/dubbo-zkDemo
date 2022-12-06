package com.example.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicketService() {
        System.out.println("生产一张票");
        return "一张票";
    }
}
