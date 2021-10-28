package automationpractice.web.helpers.contactUs;

import automationpractice.web.pages.contactUs.ContactUsPage;
import com.automationpractiveframework.utils.WaitsUtils;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;

public class ContactUsHelper {

    @Inject
    private ContactUsPage contactUsPage;

    public ContactUsHelper navigateToPage() {
        System.out.println("Navigate to 'contactUs' page");
        contactUsPage.navigateToPage();
        return this;
    }

//    public boolean isPageLoaded() {
//        boolean result = contactUsPage.is;
//        System.out.println("Check if 'contactUs' page loaded - " + result);
//        return result;
//    }

    public String CheckError(String value){
        contactUsPage.fillEmail(value);
        contactUsPage.ClicksendButton();
        return contactUsPage.errorMessageText.getText();
    }


}
