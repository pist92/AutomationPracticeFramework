package com.automationpractiveframework.objects;

public class Page {

    public String getLoginURL() {
        return loginURL;
    }

    public void setLoginURL(String loginURL) {
        this.loginURL = loginURL;
    }

    public String getIndexPage() {
        return indexPage;
    }

    public void setIndexPage(String indexPage) {
        this.indexPage = indexPage;
    }

    public String getLoginPath() {
        return loginPath;
    }

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
    }

    public String getPassPath() {
        return passPath;
    }

    public void setPassPath(String passPath) {
        this.passPath = passPath;
    }

    public String getElementForAutoUser() {
        return elementForAutoUser;
    }

    public void setElementForAutoUser(String elementForAutoUser) {
        this.elementForAutoUser = elementForAutoUser;
    }

    String loginURL;
    String indexPage;
    String loginPath;

    public Page(String loginURL, String indexPage, String loginPath, String passPath, String elementForAutoUser) {
        this.loginURL = loginURL;
        this.indexPage = indexPage;
        this.loginPath = loginPath;
        this.passPath = passPath;
        this.elementForAutoUser = elementForAutoUser;
    }

    String passPath;
    String elementForAutoUser;
}
