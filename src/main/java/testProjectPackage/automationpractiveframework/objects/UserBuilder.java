package testProjectPackage.automationpractiveframework.objects;

public class UserBuilder {
    private String login;
    private String password;

    public UserBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public User createUser() {
        return new User(login, password);
    }
}