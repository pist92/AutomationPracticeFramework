package com.automationpractiveframework.objects;

import com.automationpractiveframework.dataBase.DataInformation;

public class User {

    public User(DataInformation loginUsername, DataInformation loginPassword) {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    String login;
    String password;


}
