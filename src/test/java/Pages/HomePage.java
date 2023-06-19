package Pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.apache.http.annotation.Contract;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class HomePage {
    private SelenideElement logo = $(byXpath("//div[@class='MuiToolbar-root MuiToolbar-dense css-1jmxd2t']/a"));


    private SelenideElement buttonSignIn = $(byXpath("//div[@class='d-flex justify-content-center justify-content-lg-start flex-wrap']/a[2]"));

    private SelenideElement buttonSignUp = $(byXpath("//div[@class='d-flex justify-content-center justify-content-lg-start flex-wrap']/a[1]"));

    private SelenideElement iconUsers = $(byXpath("//div[@class='MuiBox-root css-4tv0ih']"));

    private SelenideElement buttonSignOut = $(byXpath("//i[@class='fas fa-power-off']"));


    //private ElementsCollection listRoleUserProfessorHomePage = $$(byXpath("//div[@class='MuiBox-root css-0'] // /p[contains(text(), 'student')]"));

    private ElementsCollection listRoleUserProfessorHomePage = $$(byXpath("//p[@class='sw-font-size-xs sw-text-color-616161 sw-font-family-default sw-font-weight-normal sw-text-align-left sw-letter-spacing-normal sw-padding-top-6xs sw-padding-bottom-6xs sw-padding-left-none sw-padding-right-none ']"));


    private SelenideElement buttonViewCoursesHomePage = $("[href='/course-list']");

    private SelenideElement buttonStudentDirectoryHomePage = $(" //a[contains(text(), 'Student Directory')]");
    public void logoHomePageIsVisible(){
        logo.shouldBe(visible);
    }
    public void clickOnTheButtonSignIn(){
        buttonSignIn.click();
    }
    public void clickOnTheButtonSignUp(){
        buttonSignUp.click();
    }

    public void iconUsersIsVisible(){
        iconUsers.shouldBe(visible);
    }

    public void clickOnTheButtonIconUsers(){
        iconUsers.click();
    }

    public void iconUsersIsNotVisible(){
        iconUsers.shouldNotBe(visible);
    }

    public void clickOnTheButtonSignOut(){
        buttonSignOut.click();
    }

    public void clickOnTheButtonViewCourses() {buttonViewCoursesHomePage.click();}

    public void clickOnTheButtonStudentDirectoryHomePage(){buttonStudentDirectoryHomePage.click();}

    public boolean listProfessorHomePageHatOnlyProfessorName(){
        for (SelenideElement listProfessors :
                listRoleUserProfessorHomePage)
            listRoleUserProfessorHomePage.filterBy(visible).size();
        //assertNotEquals(text("Student"));
        listRoleUserProfessorHomePage.shouldBe(CollectionCondition.texts("Student"));
        System.out.println(listRoleUserProfessorHomePage);
        return false;
    }

}

