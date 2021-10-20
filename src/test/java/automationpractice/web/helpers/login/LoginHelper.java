package automationpractice.web.helpers.login;

import automationpractice.web.pages.login.LoginPage;
import com.google.inject.Inject;

public class LoginHelper {

    @Inject
    private LoginPage loginPage;

    public LoginHelper navigateToPage() {
        System.out.println("Navigate to 'login' page");
        loginPage.navigateToPage();
        return this;
    }

    public boolean isPageLoaded() {
        boolean result = loginPage.isPageLoaded();
        System.out.println("Check if 'login' page loaded - " + result);
        return result;
    }
}
