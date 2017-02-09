package com.test.util.os;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OsValidator {
    static final Logger log = LogManager.getLogger(OsValidator.class.getName());
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {
        log.debug("Window");
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        log.debug("Unix-like");
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
    }

    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }
}
