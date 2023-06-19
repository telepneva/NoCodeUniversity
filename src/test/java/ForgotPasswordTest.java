import org.junit.Test;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void successfulForgotPassword(){
        homePage.clickOnTheButtonSignIn();
        signInPage.clickOnTheLinkForgotPassword();
        forgotPasswordPage.forgotPassword("alexFill2121@gmail.com");
        forgotPasswordPage.clickOnTheButtonRecoverPassword();
    }

}
