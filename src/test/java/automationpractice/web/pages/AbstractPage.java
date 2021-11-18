package automationpractice.web.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;

public class AbstractPage {
    private final WebElement signIn = Selenide.$x("//a[contains(text(),'Sign in')]");

    public void navigateBack() {
        WebDriverRunner.getWebDriver().navigate().back();
    }

    public void refreshPage() {WebDriverRunner.getWebDriver().navigate().refresh(); }

    public void clickSignInButton(){
        signIn.click();
    }


    public void clickButton(WebElement element){
        element.click();
    }
    // Посмотреть правильно реализован метод isElementDisplayed?
    public boolean isElementDisplayed(WebElement element){
        element.isDisplayed();
        return isElementDisplayed(element);
    }
    // Методы которые я написал в рамках вынесения в общие методы, но которые не реализованы для конкретных страниц
    public void isElementInput(WebElement element) {element.sendKeys();}
    public void clearField(WebElement element) { element.clear(); }
    public void clickDropdown(WebElement element) {element.isSelected();}
    public void clickTextField(WebElement element) {element.isSelected();}
    public void enableRadioButton(WebElement element) {element.isEnabled();}
    //Как реализовать этот метод?
    public void fillEmail(String value) {}









}
