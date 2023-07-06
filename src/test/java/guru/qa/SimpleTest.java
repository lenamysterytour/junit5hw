package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
public class SimpleTest {

    @Test
void simpleTest() {

                open("https://www.google.com/");
                $("[name=q]").setValue("selenide").pressEnter();
                $("[id=search]").shouldHave(text("https://selenide.org"));
            }
        }


