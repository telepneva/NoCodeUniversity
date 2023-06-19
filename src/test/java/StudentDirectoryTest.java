import org.junit.Test;

public class StudentDirectoryTest extends BaseTest {

    @Test
    public void deleteUserIsNotVisibleInListOfStudent(){
        homePage.clickOnTheButtonSignUp();
        signUpPage.clickOnTheRoleRegistrationForm();
        signUpPage.enterFullNameRegistrationForm("Aleks Fill");
        signUpPage.enterEmailRegistrationForm("aleksFill2121@gmail.com");
        signUpPage.enterPasswordRegistrationForm("Ghtybv1235");
        signUpPage.clickOnTheCheckBoxPrivacyPolicyRegistrationForm();
        signUpPage.clickOnTheButtonSignUpRegistrationForm();
        homePage.iconUsersIsVisible();
        apiDeleteUserTest.deleteUserStudent();
        studentDirectory.searchUserFullName("Aleks Fill");
    }
}
