package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private SelenideElement linkForgotPassword = $(byXpath("//a[@href='/forgot-password']"));
    private SelenideElement fieldEmailAuthorisationForm = $(byXpath("//input[@name='email']"));
    private SelenideElement fieldPasswordAuthorisationForm = $(byId("sw-form-password-input"));
    private SelenideElement buttonSignInAuthorisationForm = $(byId("sw-sign-in-submit-btn"));
    private SelenideElement messageNotValidEmail = $(byXpath("//div[@class='error-message login-error d-block']"));

    private SelenideElement buttonSignUpAuthorisationForm = $(byXpath("//div[@class='row align-items-center']/div[6]"));

    private SelenideElement eyeIconAuthorisationForm = $(byCssSelector("[class='fa fa-eye-slash show-password']"));

    public void successfulLogin(String emailAuthorisationForm, String passwordAuthorisationForm){
        fieldEmailAuthorisationForm.setValue(emailAuthorisationForm);
        fieldPasswordAuthorisationForm.setValue(passwordAuthorisationForm);
        buttonSignInAuthorisationForm.shouldBe(visible);
        buttonSignInAuthorisationForm.click();
    }

    public void clickOnTheButtonSignIn(){
        buttonSignInAuthorisationForm.click();
    }
    public void messageNotValidEmailIsVisible(String errorMessage){
        messageNotValidEmail.shouldBe(visible);
        messageNotValidEmail.shouldHave(text(errorMessage));
    }

    public void buttonSignInAuthorisationFormIsVisible(){
        buttonSignInAuthorisationForm.shouldBe(visible);
    }

    public void clickOnTheButtonSignUpAuthorisationForm(){
        buttonSignUpAuthorisationForm.click();
    }

    public void clickOnTheEyeIconAuthorisationForm(){
        eyeIconAuthorisationForm.click();
    }

    public void passwordIsVisibleAuthorisationForm(String passwordAuthorisationForm){
        fieldPasswordAuthorisationForm.shouldHave(text(passwordAuthorisationForm));
    }

    public void clickOnTheLinkForgotPassword(){
        linkForgotPassword.click();
    }


}
