package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage{
    public FramesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#content > div > h3")
    public WebElement  framesHeadingText;

    public WebElement getFramesHeadingText() {

        return  framesHeadingText;
    }
}
