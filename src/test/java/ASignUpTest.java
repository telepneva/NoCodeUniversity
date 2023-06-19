import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;



public class ASignUpTest extends BaseTest {

    public static String emailTeacher = "aleksShow2121@gmail.com";

    public static String emailStudent = "aleksFill2121@gmail.com";

    //public String email = UUID.randomUUID().toString() + "@example.com";

    public static String password = "Ghtybv1235";
    //RegistrationWithRoleTeacher
    @Test
    public void successfulRegistrationWithRoleTeacher(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("Aleks Show");
        signUpPage.enterEmailRegistrationForm(emailTeacher);
        signUpPage.enterPasswordRegistrationForm(password);
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        homePage.iconUsersIsVisible();
        apiDeleteUserTest.deleteUserTeacher();
    }

    @Test
    public void registrationNotSelectRole(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.enterFullNameRegistrationForm("Aleks Fill");
        signUpPage.enterEmailRegistrationForm(emailTeacher);
        signUpPage.enterPasswordRegistrationForm(password);
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }

    @Test
    public void registrationFullNameIsEmptyTeacher(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("");
        signUpPage.enterEmailRegistrationForm(emailTeacher);
        signUpPage.enterPasswordRegistrationForm(password);
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }

    @Test
    public void registrationInvalidEmailTeacher(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("Aleks Show");
        signUpPage.enterEmailRegistrationForm(emailTeacher);
        signUpPage.enterPasswordRegistrationForm(password);
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }

    @Test
    public void registrationPasswordInvalidTeacher(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("Aleks Show");
        signUpPage.enterEmailRegistrationForm(emailTeacher);
        signUpPage.enterPasswordRegistrationForm("1235");
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }

    @Test
    public void buttonSignInOpensAuthorisationForm(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheButtonSignInRegistrationForm();
    }

    @Test
    public void linkPrivacyPolicyOpensPrivacyPolicyPage(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheLinkPrivacyPolicy();
        open("https://www.softr.io/policy");
        signUpPage.titlePrivacyPolicyIsVisible("Privacy Policy");
    }

    //RegistrationWithRoleStudent
    @Test
    public void successfulRegistrationWithRoleStudent(){
    homePage.clickOnTheButtonSignUp();
    signUpPage.clickOnTheRoleRegistrationForm();
    signUpPage.enterFullNameRegistrationForm("Aleks Fill");
    signUpPage.enterEmailRegistrationForm(emailStudent);
    signUpPage.enterPasswordRegistrationForm(password);
    signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
    signUpPage.clickOnTheButtonSignUpRegistrationForm();
    homePage.iconUsersIsVisible();
    apiDeleteUserTest.deleteUserStudent();
    }

    @Test
    public void registrationFullNameIsEmptyStudent(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("");
        signUpPage.enterEmailRegistrationForm(emailStudent);
        signUpPage.enterPasswordRegistrationForm(password);
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }

    @Test
    public void registrationInvalidEmailStudent(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("Aleks Fill");
        signUpPage.enterEmailRegistrationForm(emailStudent);
        signUpPage.enterPasswordRegistrationForm(password);
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }

    @Test
    public void registrationPasswordInvalidStudent(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("Aleks Fill");
        signUpPage.enterEmailRegistrationForm(emailStudent);
        signUpPage.enterPasswordRegistrationForm("1235");
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }


    @Test
    public void registrationNotSelectPrivacyPolicyStudent(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("Aleks Fill");
        signUpPage.enterEmailRegistrationForm(emailStudent);
        signUpPage.enterPasswordRegistrationForm(password);
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        signUpPage.messageNotValidRegistrationIsVisible("Please make sure there are no empty required fields.");
    }

    @Test
    public void linkTermsOpensTermsPage(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheLinkTerms();
        open("https://www.softr.io/terms");
        signUpPage.titleTermsOfServiceIsVisible("Terms of Service");
    }
}
