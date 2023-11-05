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
                .submitRegistration();

        registrationPage
                .checkTableResult("Student Name","Anna Voron")
                .checkTableResult("Student Email","new_mail_mail@test.ru")
                .checkTableResult("Gender","Female")
                .checkTableResult("Mobile","8109832019")
                .checkTableResult("Date of Birth","22 August,2000")
                .checkTableResult("Subjects","English")
                .checkTableResult("Hobbies","Music")
                .checkTableResult("Picture","kartinki-stich-22.jpg")
                .checkTableResult("Address","Mars")
                .checkTableResult("State and City","Haryana Karnal");
    }
}