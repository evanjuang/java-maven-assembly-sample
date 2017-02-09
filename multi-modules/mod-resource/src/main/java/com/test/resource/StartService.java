package com.test.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.test.util.os.OsValidator;

public class StartService {
    static final Logger log = LogManager.getLogger(StartService.class.getName());

    public static void start() {
        log.info("Resource Module Start");

        if (OsValidator.isWindows())
            log.info("OS is Windows");
        else
            log.info("OS is not Windows");
    }
}
