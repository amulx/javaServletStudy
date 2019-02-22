package com.amu;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class mylistener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        sce.getServletContext().setAttribute("spring",classPathXmlApplicationContext);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
