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


    public ContactUsPage getPage(){
        WaitsUtils.waitForWebElementToBeVisible(emailAddressInput);
        return this;
    }

    public ContactUsPage navigateToPage(){
        WebDriverRunner.getWebDriver().navigate().to(EnvConfig.contactUsPageUrl);
        return getPage();
    }

    public boolean isSubjectHeadingPresent() {
        return subjectHeadingCheckbox.isDisplayed();
    }

    public boolean isEmailAddressPresent() {
        return emailAddressInput.isDisplayed();
    }

    public boolean isAttachFileButton() { return attachFileButton.isDisplayed(); }

    public boolean isSendButton() { return sendButton.isDisplayed(); }

    public boolean isOtherReferencePresent() {
        return otherReferenceInput.isDisplayed();
    }

    public boolean isMessagePresent() {
        return messageInput.isDisplayed();
    }
}
