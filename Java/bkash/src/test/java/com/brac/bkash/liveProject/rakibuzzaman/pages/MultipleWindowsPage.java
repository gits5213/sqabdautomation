package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > div > h3")
    public WebElement multipleWindowsHeadingText;

    public WebElement getMultipleWindowsHeadingText() {

        return  multipleWindowsHeadingText;
    }
}
