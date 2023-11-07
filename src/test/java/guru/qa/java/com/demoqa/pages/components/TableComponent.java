package guru.qa.java.com.demoqa.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableComponent {
    public void checkTableResult(String value) {
        $(".table-responsive").$(byText(value));
    }
}
