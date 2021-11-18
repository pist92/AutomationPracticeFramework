package automationpractice.web.helpers.createAnAccount;

import automationpractice.web.pages.createAnAccount.CreateAnAccountPage;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;

public class CreateAnAccountHelper {

    @Inject
    private CreateAnAccountPage createAnAccountPage;

    public CreateAnAccountHelper navigateToPage(){
        System.out.println("Navigate to create an account page");
        createAnAccountPage.navigateToPage();
        return this;
    }
    public String CheckValidationErrorMessage(String value){
        createAnAccountPage.fillEmail(value);
        createAnAccountPage.ClickSendButton();
        return createAnAccountPage.errorMessageTextAnAccount.getText();
    }
    public String CheckLabelText(WebElement value){
        if (value.isDisplayed()){
            return createAnAccountPage.createAnAccountLabel.getText();
        }
        return ("Element is Not shown");
    }

    public String CheckInfoForm(String value){
        createAnAccountPage.notify();
        return createAnAccountPage.pleaseEnterFormInfo.getText();
    }

//    public String ClearField(WebElement element){
//        createAnAccountPage.clearField(element);
//        return createAnAccountPage.
//    }
}
