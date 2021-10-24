package automationpractice.web.tests.contactUs;

import automationpractice.web.tests.BaseWebTest;
import com.google.inject.Inject;
import org.testng.annotations.BeforeMethod;

public class ContactUsTest extends BaseWebTest {

    @Inject
    private ContactUsTest contactUsTest;

    @BeforeMethod(alwaysRun = true)
    public void navigateToContactUsPage(){
        contactUsTest.navigateToPage();
    }

    private void navigateToPage() {
    }

}
