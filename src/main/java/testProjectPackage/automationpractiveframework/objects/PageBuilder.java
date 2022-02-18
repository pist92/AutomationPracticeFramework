package testProjectPackage.automationpractiveframework.objects;

public class PageBuilder {
    private String loginURL;
    private String indexPage;
    private String loginPath;
    private String passPath;
    private String elementForAutoUser;

    public PageBuilder setLoginURL(String loginURL) {
        this.loginURL = loginURL;
        return this;
    }

    public PageBuilder setIndexPage(String indexPage) {
        this.indexPage = indexPage;
        return this;
    }

    public PageBuilder setLoginPath(String loginPath) {
        this.loginPath = loginPath;
        return this;
    }

    public PageBuilder setPassPath(String passPath) {
        this.passPath = passPath;
        return this;
    }

    public PageBuilder setElementForAutoUser(String elementForAutoUser) {
        this.elementForAutoUser = elementForAutoUser;
        return this;
    }

    public Page createPage() {
        return new Page(loginURL, indexPage, loginPath, passPath, elementForAutoUser);
    }
}