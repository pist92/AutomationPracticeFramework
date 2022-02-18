package testProjectPackage.automationpractiveframework.utils;

import org.apache.log4j.Logger;

public class EnvConfig {

    static final Logger log = Logger.getLogger(EnvConfig.class);

    public static String loginPageUrl;
    public static String contactUsPageUrl;
    public static String signInUrl;

    static {
        loginPageUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        contactUsPageUrl = "http://automationpractice.com/index.php?controller=contact";
        signInUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    }


}
