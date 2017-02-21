package com.inventec.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StartApp {
    static final Logger log = LogManager.getLogger(StartApp.class.getName());

    public static void main(String[] args) {
        log.info("Start App");
        log.debug("App sleep...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.debug("App wakeup...");
        log.info("Stop App");
    }
}