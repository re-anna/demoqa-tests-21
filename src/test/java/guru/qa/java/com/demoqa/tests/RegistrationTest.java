package guru.qa.java.com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.java.com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

public class RegistrationTest extends TestBase {

    static {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.browserCapabilities = capabilities;
    }

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillAllFieldsTest() {
        registrationPage.openPage()
                .setFirstName("Anna")
                .setLastName("Voron")
                .setEmail("new_mail_mail@test.ru")
                .setGender("Female")
                .setUserNumber("8109832019")
                .setBirthDate("22", "August", "2000")
                .setSubjects(List.of("English"))
                .setHobbies(List.of("Music"))
                .uploadPicture("kartinki-stich-22.jpg")
                .setCurrentAddress("Mars")
                .selectState("Haryana")
                .selectCity("Karnal")
                .submitRegistration();

        //Check info
        registrationPage.checkTableResult("Student Name", "Anna Voron")
                .checkTableResult("Student Email", "\"new_mail_mail@test.ru")
                .checkTableResult("Gender", "Female")
                .checkTableResult("Mobile", "8109832019")
                .checkTableResult("Date of Birth", "22 August,2000")
                .checkTableResult("Subjects", "English")
                .checkTableResult("Hobbies", "Music")
                .checkTableResult("Picture", "kartinki-stich-22.jpg")
                .checkTableResult("Address", "Mars")
                .checkTableResult("State and City", "Haryana Karnal");
    }
}