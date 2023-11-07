package guru.qa.java.com.demoqa.tests;

import guru.qa.java.com.demoqa.pages.RegistrationPage;
import guru.qa.java.com.demoqa.utils.UserVariables;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RegistrationTestRandomData extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    UserVariables utils = new UserVariables();

    @Test
    void fillAllFieldsTest() {
        registrationPage.openPage()
                .removeBanners()
                .setFirstName(utils.firstName)
                .setLastName(utils.lastName)
                .setEmail(utils.userEmail)
                .setGender(utils.genderWrapper)
                .setUserNumber(utils.userNumber)
                .setBirthDate(utils.birthDay,utils.birthMonth,utils.birthYear)
                .setSubjects(List.of(utils.subjectsInput))
                .setHobbies(List.of(utils.hobbiesWrapper))
                .uploadPicture(utils.uploadPicture)
                .setCurrentAddress(utils.currentAddress)
                .selectState(utils.state)
                .selectCity(utils.city)
                .submitRegistration();

        registrationPage
                .checkTableResult(utils.firstName)
                .checkTableResult(utils.lastName)
                .checkTableResult(utils.userEmail)
                .checkTableResult(utils.genderWrapper)
                .checkTableResult(utils.userNumber)
                .checkTableResult(utils.birthDay + " " + utils.birthMonth + "," + utils.birthYear)
                .checkTableResult(utils.subjectsInput)
                .checkTableResult(utils.hobbiesWrapper)
                .checkTableResult(utils.uploadPicture)
                .checkTableResult(utils.currentAddress)
                .checkTableResult(utils.state + " " + utils.city);
    }
}