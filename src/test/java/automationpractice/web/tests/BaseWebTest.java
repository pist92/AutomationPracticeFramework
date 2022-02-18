package automationpractice.web.tests;



import testProjectPackage.automationpractiveframework.web.DriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseWebTest {

    @BeforeClass(alwaysRun = true)
    public void runChrome() {
        DriverUtils.runChromeBrowser();
        DriverUtils.browserConfiguration();
    }

    @AfterClass(alwaysRun = true)
    public void closeAll() {
        DriverUtils.tearDownBrowser();
    }
}