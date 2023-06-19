import org.junit.Test;

public class HomePageTest extends BaseTest {

    public static String emailFurAuthorisationTeacher = "roxanne@example.com";

    public static String emailFurAuthorisationStudent = "malik@example.com";

    public static String passwordFurAuthorisation = "123456";


    //TestsWithOutAuthorisation
    @Test
    public void logoIsVisible(){
        homePage.logoHomePageIsVisible();
    }


    @Test
    public void professorSpotlightNotHatInformationAboutStudent(){
        homePage.listProfessorHomePageHatOnlyProfessorName();
    }

//testWithRoleTeacher
    @Test
    public void buttonViewCoursesGoToTheCoursesPage(){
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailFurAuthorisationTeacher, passwordFurAuthorisation);
        homePage.iconUsersIsVisible();
        homePage.clickOnTheButtonViewCourses();
        coursesPage.titleOurCoursesIsVisible();
    }

    @Test
    public void buttonStudentDirectoryGoToTheStudentDirectoryPage(){
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailFurAuthorisationTeacher, passwordFurAuthorisation);
        homePage.iconUsersIsVisible();
        homePage.clickOnTheButtonStudentDirectoryHomePage();
        studentDirectory.titleStudentDirectoryPageIsVisible();
    }

    @Test
    public void professorSpotlightNotHatInformationAboutStudentTeacher(){
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin(emailFurAuthorisationTeacher, passwordFurAuthorisation);
        homePage.iconUsersIsVisible();
        homePage.listProfessorHomePageHatOnlyProfessorName();
    }

}
