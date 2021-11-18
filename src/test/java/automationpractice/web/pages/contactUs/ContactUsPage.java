package automationpractice.web.pages.contactUs;

import automationpractice.web.pages.AbstractPage;
import com.automationpractiveframework.utils.EnvConfig;
import com.automationpractiveframework.utils.WaitsUtils;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends AbstractPage {

    private final WebElement subjectHeadingCheckbox = Selenide.$x("//select[@id='id_contact']");
    private final WebElement emailAddressInput = Selenide.$x("//input[@id='email']");
    private final WebElement otherReferenceInput = Selenide.$x("//input[@id='id_order']");
    private final WebElement attachFileButton = Selenide.$x("//span[contains(text(),'Choose File')]");
    private final WebElement sendButton = Selenide.$x("//span[contains(text(),'Send')]");
    private final WebElement messageInput = Selenide.$x("//textarea[@id='message']");
    public final WebElement errorMessageText = Selenide.$x("//li[contains(text(),'Invalid email address.')]");


    public ContactUsPage getPage(){
        WaitsUtils.waitForWebElementToBeVisible(emailAddressInput);
        isElementDisplayed(attachFileButton);
        return this;
    }

    public ContactUsPage navigateToPage(){
        WebDriverRunner.getWebDriver().navigate().to(EnvConfig.contactUsPageUrl);
        return getPage();
    }

    public ContactUsPage isPageLoad(){
        WaitsUtils.waitForWebElementToBeVisible(attachFileButton);
       return this;
    }

    public boolean isSubjectHeadingPresent() {
        return subjectHeadingCheckbox.isDisplayed();
    }

    public void fillEmail(String value) {
        emailAddressInput.clear();
    }

    public void clearField(WebElement element) {
        element.clear();
    }

    public boolean isElementDisplayed() {
        return emailAddressInput.isDisplayed();
    }

    public void clickButton() {
        sendButton.click();
    }


    public boolean isOtherReferencePresent() {
        clickButton(sendButton);
        return otherReferenceInput.isDisplayed();

    }



}
