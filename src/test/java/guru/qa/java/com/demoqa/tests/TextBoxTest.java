package guru.qa.java.com.demoqa.tests;

import guru.qa.java.com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTest extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    private String textBoxPageUrl = "/text-box";

    @Test
    public void registrationTextBoxTest() {
        textBoxPage.openPage()
                .setFullName("Anna Voron")
                .setEmail("new_mail_mail@test.ru")
                .setCurrentAddress("Mars")
                .setPermanentAddress("Haryana Karnal")
                .clickSubmitButton();

        textBoxPage.checkOutputResult(
                "Anna Voron",
                "new_mail_mail@test.ru",
                "Mars",
                "Haryana Karnal");
    }
}