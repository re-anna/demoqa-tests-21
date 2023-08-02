package guru.qa.java.com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstLessonTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

   // @Test
    void registrationPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");


        $("#firstName").setValue("Anna");
        $("#lastName").setValue("Voron");
        $("#userEmail").setValue("new_mail_mail@test.ru");

        $("#genterWrapper").$(byText("Female")).click();

        $("#userNumber").setValue("8109832019");

        $("#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").click();
        $("select.react-datepicker__month-select").selectOption("August");
        $("select.react-datepicker__year-select").click();
        $("select.react-datepicker__year-select").selectOption("2000");
        $("div.react-datepicker__day.react-datepicker__day--022").click();

        $("#subjectsInput").setValue("No").pressEnter();

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        // File file = new File("C:\\Users\\Honor R5\\IdeaProjects\\demoqa-tests-21\\src\\test\\java\\guru\\qa\\java\\resources\\kartinki-stich-22.jpg");
        // $x("//input[@id='uploadPicture']").uploadFile(file);
       $("#uploadPicture").uploadFromClasspath("kartinki-stich-22.jpg");


        $("#currentAddress").setValue("Mars");

        $("#stateCity-wrapper").$(byText("Select State")).click();
        $("#react-select-3-option-2").click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#react-select-4-option-0").click();

        $("#submit").click();

        //Check info
        $x("//td[contains(text(), 'Student Name')]/following-sibling::td[1]").shouldHave(text("Anna Voron"));
        $x("//td[contains(text(), 'Student Email')]/following-sibling::td[1]").shouldHave(text("new_mail_mail@test.ru"));
        $x("//td[contains(text(), 'Gender')]/following-sibling::td[1]").shouldHave(text("Female"));
        $x("//td[contains(text(), 'Mobile')]/following-sibling::td[1]").shouldHave(text("8109832019"));
        $x("//td[contains(text(), 'Date of Birth')]/following-sibling::td[1]").shouldHave(text("22 August,2000"));
        $x("//td[contains(text(), 'Subjects')]/following-sibling::td[1]").shouldHave(text("No"));
        $x("//td[contains(text(), 'Hobbies')]/following-sibling::td[1]").shouldHave(text("Sports"));
        $x("//td[contains(text(), 'Hobbies')]/following-sibling::td[1]").shouldHave(text("Music"));
        $x("//td[contains(text(), 'Picture')]/following-sibling::td[1]").shouldHave(text("kartinki-stich-22.jpg"));
        $x("//td[contains(text(), 'Address')]/following-sibling::td[1]").shouldHave(text("Mars"));
        $x("//td[contains(text(), 'State and City')]/following-sibling::td[1]").shouldHave(text("Haryana Karnal"));
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }
}
