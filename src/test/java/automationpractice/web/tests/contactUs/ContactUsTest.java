package automationpractice.web.tests.contactUs;

import automationpractice.web.helpers.contactUs.ContactUsHelper;
import automationpractice.web.pages.contactUs.ContactUsPage;
import automationpractice.web.tests.BaseWebTest;
import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice
public class ContactUsTest extends BaseWebTest {

    @Inject
    private ContactUsHelper contactUsHelper;
    @Inject
    private ContactUsPage contactUsPage;

    @BeforeMethod(alwaysRun = true)
    public void navigateToPage(){
        contactUsHelper.navigateToPage();
    }

    @Test
    public void openContactUsPageTest() {
        Assert.assertEquals(contactUsHelper.CheckError("some"),"Invalid email address.");
    }

    @Test
    public void inputEmailValidationTest(){
        Assert.assertEquals(contactUsHelper.CheckValidationError(""),"Invalid email address.");

    }

   // @AfterMethod(alwaysRun = true)

//    @Test
//    public void validationEmailAddressTest(){
//        WebDriver driver = new ChromeDriver();
//        driver.get(contactUsPageUrl);
//        WebElement emailAddressInput = driver.findElement(By.xpath("//input[@id='email']"));
//        emailAddressInput.sendKeys("some");
//        WebElement sendButton = driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
//        sendButton.click();
//        driver.quit();
//
//        Assert.assertEquals("some", "some@gmail.com");
//    }



}
