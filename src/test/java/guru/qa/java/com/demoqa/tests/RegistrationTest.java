package guru.qa.java.com.demoqa.tests;

import guru.qa.java.com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RegistrationTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillAllFieldsTest() {
        registrationPage.openPage()
                .removeBanners()
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
                .submitRegistration()
                .checkTableResult("Anna Voron", "new_mail_mail@test.ru", "Female", "8109832019",
                        "22 August,2000", "English", "Music", "kartinki-stich-22.jpg",
                        "Mars", "Haryana Karnal");
    }

}