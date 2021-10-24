package automationpractice.web.pages.contactUs;

import automationpractice.web.pages.AbstractPage;
import automationpractice.web.pages.login.LoginPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;
import com.automationpractiveframework.utils.

public class ContactUsPage extends AbstractPage {

    private final WebElement subjectHeadingCheckbox = Selenide.$x("//select[@id='id_contact']");
    private final WebElement emailAddressInput = Selenide.$x("//input[@id='email']");
    private final WebElement otherReferenceInput = Selenide.$x("//input[@id='id_order']");
    private final WebElement attachFileButton = Selenide.$x("//span[contains(text(),'Choose File')]");
    private final WebElement sendButton = Selenide.$x("//span[contains(text(),'Send')]");
    private final WebElement messageInput = Selenide.$x("//textarea[@id='message']");


    public ContactUsPage getPage(){
        WaitsUtils.waitForWebelementToBeVisible();
    }

    public ContactUsPage navigateToPage(){
        WebDriverRunner.getWebDriver().navigate().to(EnvConfig.loginPageUrl);
        return getPage();
    }
}
