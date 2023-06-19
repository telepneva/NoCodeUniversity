import Pages.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public final String BASE_URL = "https://erich416.softr.app";

    HomePage homePage = new HomePage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    SignUpPage signUpPage = new SignUpPage();

    SignInPage signInPage = new SignInPage();

    ApiDeleteUserTest apiDeleteUserTest = new ApiDeleteUserTest();

    CoursesPage coursesPage = new CoursesPage();

    StudentDirectory studentDirectory = new StudentDirectory();

    @Before
    public void setUp(){
        Configuration.fastSetValue = false;
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        //Configuration.browser = "firefox";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(BASE_URL);
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }

}

