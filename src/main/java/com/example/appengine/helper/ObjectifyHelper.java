package com.example.appengine.helper;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ObjectifyHelper implements ServletContextListener {

    public static void register() {
    }

    public void contextInitialized(ServletContextEvent event) {
        register();
    }

    public void contextDestroyed(ServletContextEvent event) {
    }
}
