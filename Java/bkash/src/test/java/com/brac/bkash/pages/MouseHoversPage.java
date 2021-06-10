package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseHoversPage extends BasePage{
    public MouseHoversPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "h3")
    public WebElement mouseHeadingText;

    public WebElement getMouseHeadingText() {
        return mouseHeadingText;
    }
}
