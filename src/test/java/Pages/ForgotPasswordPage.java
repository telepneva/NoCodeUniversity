package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {
    private SelenideElement fieldEmail = $(byId("forgot-password-email--1161217580"));
    private SelenideElement buttonRecoverPassword = $(byXpath("//button[@type='button']/span[@class='MuiTouchRipple-root css-w0pj6f']"));

    public void forgotPassword(String emailValue){
        fieldEmail.setValue(emailValue);
        buttonRecoverPassword.click();
    }

    public void clickOnTheButtonRecoverPassword(){
        buttonRecoverPassword.click();
    }
}
