package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InScrollPage extends BasePage{
    public InScrollPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement inScrollHeadingText;

    public WebElement getInScrollHeadingText() {
        return inScrollHeadingText;
    }





}
