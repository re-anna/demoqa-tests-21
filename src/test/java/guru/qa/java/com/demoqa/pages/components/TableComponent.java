package guru.qa.java.com.demoqa.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableComponent {
    public void compareTableResult(String name, String value) {
        $(".table-responsive").$(byText(name)).parent().shouldHave(text(value)); }
}
