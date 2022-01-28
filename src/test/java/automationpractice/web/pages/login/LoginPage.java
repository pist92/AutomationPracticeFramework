package automationpractice.web.pages.login;

import automationpractice.web.pages.AbstractPage;
import com.automationpractiveframework.utils.WaitsUtils;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private final WebElement emailInput = Selenide.$x("//input[@id='email']");
    private final WebElement passwordInput = Selenide.$x("//input[@id='passwd']");
    private final WebElement signInButton = Selenide.$x("//button[@id='SubmitLogin']");
    private final String loginPageUrl = "index.php?controller=authentication&back=my-account";

    public LoginPage getPage() {
        WaitsUtils.waitForWebElementToBeVisible(passwordInput);
        return this;
    }

    public LoginPage navigateToPage(){
        //WebDriverRunner.getWebDriver().navigate().to(EnvConfig.mainPage+EnvConfig.loginPageUrl);
        return getPage();
    }
    public boolean isLoginFieldPresent() {
        return emailInput.isDisplayed();
    }

    public boolean isPasswordFieldPresent() {
        return passwordInput.isDisplayed();
    }

    public boolean isSignInButton() { return signInButton.isDisplayed(); }

    public boolean isPageLoaded() {
        return signInButton.isDisplayed();
    }


}
