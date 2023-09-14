package org.example.spring6.ioc.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    void demo1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");

        // 根据id获取bean
        User user1 = (User)classPathXmlApplicationContext.getBean("user1");
        user1.run();

        // 根据类型获取
//        User user = classPathXmlApplicationContext.getBean(User.class);
//        user1.run();

        // 根据id和类型
//        User user11 = classPathXmlApplicationContext.getBean("user1", User.class);
    }

}
