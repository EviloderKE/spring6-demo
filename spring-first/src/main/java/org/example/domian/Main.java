package org.example.domian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");

        // 原理是反射 生成的对象保存在DefaultListableBeanFactory.beanDefinitionMap
        User user = (User) classPathXmlApplicationContext.getBean("user");

        user.aa();
    }
}
