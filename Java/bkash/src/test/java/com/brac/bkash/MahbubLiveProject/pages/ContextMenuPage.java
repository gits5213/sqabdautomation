package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage{
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement contextHeadingText;

    public WebElement getContextHeadingText() {
        return contextHeadingText;
    }

    @FindBy(css = "div#hot-spot")
    public WebElement contextZone;

    public WebElement getContextZone() {
        return contextZone;
    }




}
