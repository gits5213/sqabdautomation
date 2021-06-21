package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementsPage extends BasePage{
    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > h3")
    public WebElement addRemoveElementsHeadingText;

    public WebElement getAddRemoveElementsHeadingText() {

        return addRemoveElementsHeadingText;
    }
}
