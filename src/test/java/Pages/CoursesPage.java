package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CoursesPage {

    private SelenideElement titleOurCoursesCoursesPage = $("[class='ql-editor']");

    public void titleOurCoursesIsVisible(){
        titleOurCoursesCoursesPage.shouldBe(visible);
    }
}
