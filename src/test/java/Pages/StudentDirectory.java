package Pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class StudentDirectory {

    private SelenideElement titleStudentDirectoryPage = $("[class='ql-editor']");

    private ElementsCollection listOfStudentName = $$("[class='sw-font-size-xl sw-text-color-0A0A0A sw-font-family-default sw-font-weight-semibold " +
            "sw-text-align-left sw-letter-spacing-normal sw-padding-top-none sw-padding-bottom-7xs sw-padding-left-none sw-padding-right-none ']");

    public void titleStudentDirectoryPageIsVisible(){
        titleStudentDirectoryPage.shouldBe(Condition.visible);
    }

    public void searchUserFullName(String fullName){
        for (SelenideElement fullNameStudent:
                listOfStudentName) {
            listOfStudentName.shouldHave(CollectionCondition.texts(fullName));
        }

    }


}
