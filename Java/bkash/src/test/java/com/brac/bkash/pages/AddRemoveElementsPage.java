package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementsPage extends BasePage {

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#content > h3")
    public WebElement addRemoveElementHeadText;

    public WebElement getAddRemoveElementHeadText() {
        return addRemoveElementHeadText;
    }

    @FindBy(xpath ="//div[@id='content']//button[.='Add Element']")
    public WebElement getAddButtonText;

    public WebElement getAddButtonText() {
        return getAddButtonText;
    }

    @FindBy(xpath ="//div[@id='elements']/button[@class='added-manually']")
    public WebElement getDelButtonText;

    public WebElement getDelButtonText() {
        return getDelButtonText;
    }

}
