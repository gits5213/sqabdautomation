package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="//div[@id='content']//h3[.='Checkboxes']")
    public WebElement checkboxesHeadingText;
    public WebElement getCheckboxesHeadingText() {
        return checkboxesHeadingText;


    }
}
