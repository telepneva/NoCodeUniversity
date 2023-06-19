import org.junit.Test;

public class BSignInTest extends BaseTest {

    public static String emailTeacher = "aleksShow2121@gmail.com";

    public static String emailStudent = "aleksFill2121@gmail.com";

    public static String password = "Ghtybv1235";

    //AuthorisationWithRoleStudent
    @Test
    public void testSuccessfulAuthorisationWiThRoleStudent() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailStudent, password);
        homePage.iconUsersIsVisible();
    }


    @Test
    public void authorisationWiThRoleStudentNotValidPassword() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailStudent, password);
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void authorisationWiThRoleStudentNotValidEmail() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailStudent, password);
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void LogOutWiThRoleStudent() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailStudent, password);
        homePage.clickOnTheButtonIconUsers();
        homePage.clickOnTheButtonSignOut();
        homePage.iconUsersIsNotVisible();
        signInPage.buttonSignInAuthorisationFormIsVisible();
    }

    @Test
    public void buttonSignUpOpensOnTheSignUpForm() {
        homePage.clickOnTheButtonSignIn();
        signInPage.clickOnTheButtonSignUpAuthorisationForm();
        signUpPage.formSignUpIsVisibleFurCheckButtonSignUpInSignInTest();
    }


    //AuthorisationWithRoleTEACHER
    @Test
    public void testSuccessfulAuthorisationWiThRoleTeacher() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailTeacher, password);
        homePage.iconUsersIsVisible();
    }


    @Test
    public void authorisationWiThRoleTeacherNotValidPassword() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailTeacher, password);
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void authorisationWiThRoleTeacherNotValidEmail() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailTeacher, password);
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void LogOutWiThRoleTeacher() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailTeacher, password);
        homePage.clickOnTheButtonIconUsers();
        homePage.clickOnTheButtonSignOut();
        homePage.iconUsersIsNotVisible();
        signInPage.buttonSignInAuthorisationFormIsVisible();
    }

}
