package automationpractice.web.helpers.contactUs;

import com.google.inject.Inject;

public class ContactUsHelper {

    @Inject
    private ContactUsHelper contactUsHelper;

    public ContactUsHelper navigateToPage() {
        System.out.println("Navigate to 'contactUs' page");
        contactUsHelper.navigateToPage();
        return this;
    }

    public boolean isPageLoaded() {
        boolean result = contactUsHelper.isPageLoaded();
        System.out.println("Check if 'contactUs' page loaded - " + result);
        return result;
    }


}
