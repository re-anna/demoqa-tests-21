package guru.qa.java.com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.java.com.demoqa.pages.components.CalendarComponent;
import guru.qa.java.com.demoqa.pages.components.TableComponent;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    TableComponent tableComponent = new TableComponent();
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput =  $("#userEmail"),
            genterWrapper =   $("#genterWrapper"),
            userNumber =  $("#userNumber"),
            birthDateInput = $("#dateOfBirth").$(".react-datepicker-wrapper"),
            subjectInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicturesField = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            submitButton = $("#submit"),
            tableResultTr = $(".table-responsive");

    public RegistrationPage openPage() {
        open("automation-practice-form");
        return this;
    }
    public RegistrationPage removeBanners(){
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }
    public RegistrationPage setFirstName(String name) {
        firstNameInput.setValue(name);
        return this;
    }
    public RegistrationPage setLastName(String lastName){
        lastNameInput.setValue(lastName);
        return this;
    }
    public RegistrationPage setEmail(String email){
        userEmailInput.setValue(email);
        return this;
    }
    public RegistrationPage setGender(String value) {
        genterWrapper.$(byText(value)).click();
        return this;
    }
    public RegistrationPage setUserNumber(String number) {
        userNumber.setValue(number);
        return this;
    }
    public RegistrationPage setBirthDate(String day, String month, String year){
        birthDateInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    public RegistrationPage setSubjects(List<String> subjects) {
        for (String subject : subjects){
            subjectInput.setValue(subject).pressEnter();
        }
        return this;
    }
    public RegistrationPage setHobbies(List<String> hobbies) {
        for (String hobby : hobbies){
            hobbiesWrapper.$(byText(hobby)).click();
        }
        return this;
    }
    public RegistrationPage uploadPicture(String fileName) {
        uploadPicturesField.uploadFromClasspath(fileName);
        return this;
    }
    public RegistrationPage setCurrentAddress(String address) {
        currentAddress.setValue(address);
        return this;
    }
    public RegistrationPage selectState(String stateName) {
        state.scrollTo().click();
        state.$(byText(stateName)).click();
        return this;
    }
    public RegistrationPage selectCity(String cityName) {
        city.scrollTo().click();
        city.$(byText(cityName)).click();
        return this;
    }
    public RegistrationPage submitRegistration() {
        submitButton.click();
        return this;
    }
    public RegistrationPage checkTableResult(String value) {
        tableComponent.checkTableResult(value);
        return this;
    }
}
