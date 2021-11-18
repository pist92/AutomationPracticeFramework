package automationpractice.web.tests.createAnAccount;

import automationpractice.web.helpers.createAnAccount.CreateAnAccountHelper;
import automationpractice.web.pages.createAnAccount.CreateAnAccountPage;
import automationpractice.web.tests.BaseWebTest;
import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice
public class CreateAnAccountTest extends BaseWebTest {

    @Inject
    private CreateAnAccountHelper createAnAccountHelper;
    @Inject
    private CreateAnAccountPage createAnAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void navigateToPage(){
        createAnAccountHelper.navigateToPage();
    }


    @Test
    public void openCreateAnAccountPageTest(){

        Assert.assertEquals(createAnAccountHelper.CheckValidationErrorMessage("some"), "Invalid email address.");
    }

    @Test
    public void inputEmailValidationTest(){

        Assert.assertEquals(createAnAccountHelper.CheckValidationErrorMessage(""), "Invalid email address.");
    }

    @Test
    public void labelValidationTest(){

        Assert.assertEquals(createAnAccountHelper.CheckLabelText(<"Please enter your email address to create an account"), "Please enter your email address to create an account");

    }

    @Test
    public void enterFormValidationTest(){

        Assert.assertEquals(createAnAccountHelper.CheckInfoForm("CREATE AN ACCOUNT"), "CREATE AN ACCOUNT");
    }

   // @AfterMethod(alwaysRun = true){
}
