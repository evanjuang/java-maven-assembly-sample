package com.test.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.test.resource.StartService;

public class Start {
    static final Logger log = LogManager.getLogger(Start.class.getName());

    public static void main(String[] args) {
        log.info("Main Start");
        StartService.start();
    }
}
