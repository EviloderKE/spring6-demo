package org.example.domian;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class UserTest {

    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    void aa(){
        logger.info("开始");

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");

        // 原理是反射 生成的对象保存在DefaultListableBeanFactory.beanDefinitionMap
        User user = (User) classPathXmlApplicationContext.getBean("user");

        user.aa();
    }

    @Test
    void bb() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("org.example.domian.User");
        //Object obj = clazz.newInstance();
        Object object = clazz.getDeclaredConstructor().newInstance();

        System.out.println(object);
    }
}
