package automationpractice.web.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    private final WebElement signIn = Selenide.$x("//a[contains(text(),'Sign in')]");


    public void navigateBack() {
        WebDriverRunner.getWebDriver().navigate().back();
    }

    public void refreshPage() {
        WebDriverRunner.getWebDriver().navigate().refresh();
    }

    public void clickSignInButton(){
        signIn.click();
    }


}
