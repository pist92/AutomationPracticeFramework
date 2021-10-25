package automationpractice.web.tests.contactUs;

import automationpractice.web.helpers.contactUs.ContactUsHelper;
import automationpractice.web.tests.BaseWebTest;
import com.google.inject.Inject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice
public class ContactUsTest extends BaseWebTest {

    @Inject
    private ContactUsHelper contactUsHelper;

    @BeforeMethod(alwaysRun = true)
    public void navigateToContactUsPage(){
        contactUsHelper.navigateToPage();
    }

    @Test(description = "Login test", groups = {"smoke", "regression"})
    private void navigateTest() {
    }

}
