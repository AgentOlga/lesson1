package Lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationBlock {
    private SelenideElement womenButton = $(By.xpath("//a[@title='Women']"));

    private SelenideElement tshirtsInWomenSuggestButton = $(By.xpath("//ul[contains(@class,'submenu-container')]//a[@title='T-shirts']"));

    @Step("Клик на кнопку TShirts в выпадающем меню Женщины")
    public TShirtsPage clickTShirtsButtonInWomenSuggest() {
        //womenButton.hover();
        tshirtsInWomenSuggestButton.click();
        return page(TShirtsPage.class);
    }
}


