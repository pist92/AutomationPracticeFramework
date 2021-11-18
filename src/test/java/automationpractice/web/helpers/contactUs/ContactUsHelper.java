package automationpractice.web.helpers.contactUs;

import automationpractice.web.pages.contactUs.ContactUsPage;
import com.google.inject.Inject;

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
        contactUsPage.clickButton();
        return contactUsPage.errorMessageText.getText();
    }

    public String CheckValidationError(String value){
        contactUsPage.fillEmail(value);
        contactUsPage.clickButton();
        return contactUsPage.errorMessageText.getText();
    }
}
