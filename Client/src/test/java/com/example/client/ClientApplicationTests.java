package com.example.client;

import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        for (int i = 0; i < 100; i++) {
            userService.buyTicket();
        }
    }

}
