package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {

    private SelenideElement formSignUp = $(byId("signup"));
    private SelenideElement filterSelectYourRole = $(byClassName("filter-option-inner-inner"));
    private SelenideElement roleTeacher = $(byId("bs-select-1-0"));
    private SelenideElement roleStudent = $(byId("bs-select-1-1"));
    private SelenideElement fieldFullNameRegistrationForm = $(byId("sw-form-capture-full_name-input"));
    private SelenideElement fieldEmailRegistrationForm = $(byId("sw-form-capture-email-input"));
    private SelenideElement fieldPasswordRegistrationForm = $(byId("sw-form-password-input"));
    private SelenideElement fieldPasswordRegistrationForm1 = $(byXpath("//div[contains(@class, 'text-center password')]"));
    private SelenideElement checkBoxPrivacyPolicy = $(byXpath("//span[(@class='checkmark position-relative sw-checkbox')]"));
    private SelenideElement buttonSignUpRegistrationForm = $(byId("sw-sign-up-submit-btn"));

    private SelenideElement messageErrorRegistration = $(byXpath("//div[@class='error-message required-errors d-block']"));

    private SelenideElement linkTerms = $(byXpath("//a[contains(text(), 'Terms')]"));

    private SelenideElement titleTermsOfService = $(byXpath("//div[@class='col-12 sw-font-family-default sw-line-height-loose ']"));

    private SelenideElement titlePrivacyPolicy = $(byXpath("//strong[contains(text(), 'Privacy Policy')]"));

    private SelenideElement linkPrivacyPolicy = $(byXpath("//a[contains(text(), 'Privacy Policy')]"));

    private SelenideElement buttonSignInRegistrationForm = $(byId("sw-go-to-sign-in-btn"));




    public void formSignUpIsVisibleFurCheckButtonSignUpInSignInTest(){
        formSignUp.shouldBe(visible);
    }
    public void clickOnTheRoleRegistrationForm(){
        filterSelectYourRole.click();
        roleStudent.click();
    }

    public void enterFullNameRegistrationForm(String fullNameValue){
        fieldFullNameRegistrationForm.setValue(fullNameValue);
    }
    public void enterEmailRegistrationForm(String emailValueRegistration) {
        fieldEmailRegistrationForm.setValue(emailValueRegistration);
    }
    public void enterPasswordRegistrationForm(String passwordValueRegistration){
        fieldPasswordRegistrationForm.setValue(passwordValueRegistration);
    }
    public void clickOnTheCheckBoxPrivacyPolicyRegistrationForm(){
        checkBoxPrivacyPolicy.click();
    }

    public void clickOnTheButtonSignUpRegistrationForm(){
        buttonSignUpRegistrationForm.click();
    }

    public void messageNotValidRegistrationIsVisible(String textMessageErrorRegistrationForm){
        messageErrorRegistration.shouldBe(visible);
        messageErrorRegistration.shouldHave(text(textMessageErrorRegistrationForm));
    }

    public void clickOnTheLinkTerms(){
        linkTerms.click();
    }

    public void titleTermsOfServiceIsVisible(String titleTermsPage){
        titleTermsOfService.shouldBe(visible);
        titleTermsOfService.shouldHave(text(titleTermsPage));
    }

    public void clickOnTheLinkPrivacyPolicy(){
        linkPrivacyPolicy.click();

    }
    public void titlePrivacyPolicyIsVisible(String titlePrivacyPage){
        titlePrivacyPolicy.shouldBe(visible);
        titlePrivacyPolicy.shouldHave(text(titlePrivacyPage));
    }

    public void clickOnTheButtonSignInRegistrationForm(){
        buttonSignInRegistrationForm.click();
    }
}

