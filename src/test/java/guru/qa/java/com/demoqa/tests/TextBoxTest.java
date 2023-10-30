package guru.qa.java.com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.java.com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TextBoxTest extends TestBase {

    static {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.browserCapabilities = capabilities;
    }

    TextBoxPage textBoxPage = new TextBoxPage();

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