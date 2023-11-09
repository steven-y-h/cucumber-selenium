package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModelsPage extends PageObject {
    @FindBy(name = "q")
    WebElement element;

    public void inputSearch(String query) {
        element.sendKeys(query);
        element.submit();
    }

    public boolean isThePageTitleStartWith(String title) {
        return getDriver().getTitle().toLowerCase().startsWith(title);
    }

    public void openGoogle() {
        getDriver().get("https://www.google.com");
    }
}
