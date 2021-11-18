package automationpractice.web.pages.createAnAccount;

import automationpractice.web.pages.AbstractPage;
import com.automationpractiveframework.utils.EnvConfig;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;

public class CreateAnAccountPage extends AbstractPage {

    public final WebElement createAnAccountLabel = Selenide.$x("//h3[contains(text(),'Create an account')]");
    public final WebElement pleaseEnterFormInfo = Selenide.$x("//p[contains(text(),'Please enter your email address to create an accou')]");
    private final WebElement emailAddressInput = Selenide.$x("//input[@id='email_create']");
    private final WebElement createAnAccountButton =  Selenide.$x("//button[@id='SubmitCreate']");
    public final WebElement errorMessageTextAnAccount = Selenide.$x("//li[contains(text(),'Invalid email address.')]");


    public CreateAnAccountPage navigateToPage(){
        WebDriverRunner.getWebDriver().navigate().to(EnvConfig.signInUrl);
        return this;
    }

    public void fillEmail(String value) {
        emailAddressInput.clear();
    }

    public void clearField(WebElement element) { element.clear(); }

    public void ClickSendButton() { createAnAccountButton.click(); }



}
