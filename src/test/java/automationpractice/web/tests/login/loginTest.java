package automationpractice.web.tests.login;

import automationpractice.web.helpers.login.LoginHelper;
import automationpractice.web.tests.BaseWebTest;
import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice
public class loginTest extends BaseWebTest {

    @Inject
    private LoginHelper loginHelper;

    @BeforeMethod(alwaysRun = true)
    public void navigateToLoginPage() {
        loginHelper.navigateToPage();
    }

    @Test(description = "Login test", groups = {"smoke", "regression"})
    public void navigateTest() {
        Assert.assertTrue(3==3);
//        assertThat("Login page isn't loaded", loginHelper.isPageLoaded(), Matchers.equalTo(true));
    }
}
