package com.example.service;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

//定义一个和生产者路径一模一样路径的接口类（第二种办法拿到生产者的数据是从pom文件配置）
//把当前接口类注册到Springboot容器中
@Service
public class UserService {

    //去注册中心zookeeper拿到生产者提供的数据
    @DubboReference
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicketService();
        System.out.println("消费者拿到：" + ticket);
    }

}
