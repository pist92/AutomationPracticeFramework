package automationpractice.web.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;

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


    public void clickButton(WebElement element){
        element.click();
    }
    public void isElemeDis(WebElement element){
        element.isDisplayed();
    }







}
