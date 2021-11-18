package com.automationpractiveframework.utils;

import org.apache.log4j.Logger;

public class EnvConfig {

    static final Logger log = Logger.getLogger(EnvConfig.class);

    public static String loginPageUrl;
    public static String contactUsPageUrl;
    public static String signInUrl;
    public static String pageURL;

    //Как красиво сделать конкатенация строк?

    static {
        loginPageUrl = "/index.php?controller=authentication&back=my-account";
        contactUsPageUrl = "/index.php?controller=contact";
        signInUrl = "/index.php?controller=authentication&back=my-account";
        pageURL = "http://automationpractice.com";
    }


}
