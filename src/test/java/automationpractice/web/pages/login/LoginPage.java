package automationpractice.web.pages.login;

import automationpractice.web.pages.AbstractPage;
import com.automationpractiveframework.utils.EnvConfig;
import com.automationpractiveframework.utils.WaitsUtils;
import com.automationpractiveframework.web.DriverUtils;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends AbstractPage {





    private final WebElement emailInput = Selenide.$x("//input[@id='email']");
    private final WebElement passwordInput = Selenide.$x("//input[@id='passwd']");
    private final WebElement signInButton = Selenide.$x("//button[@id='SubmitLogin']");


    public LoginPage getPage() {
        WaitsUtils.waitForWebElementToBeVisible(passwordInput);
        return this;
    }

    public LoginPage navigateToPage(){
        WebDriverRunner.getWebDriver().navigate().to(EnvConfig.loginPageUrl);
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
