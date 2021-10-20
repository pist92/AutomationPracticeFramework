package com.automationpractiveframework.utils;

import org.apache.log4j.Logger;

public class EnvConfig {

    static final Logger log = Logger.getLogger(EnvConfig.class);

    public static String loginPageUrl;


    static {
        loginPageUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    }

}
