package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrameTestPage extends BasePage {
    public FrameTestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement frameTestHeadingText;

    public WebElement getFrameTestHeadingText() {
        return frameTestHeadingText;

    }
}
