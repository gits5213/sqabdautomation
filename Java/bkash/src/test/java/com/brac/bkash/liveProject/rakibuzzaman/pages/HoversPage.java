package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoversPage extends BasePage{
    public HoversPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#content > div > h3")
    public WebElement hoversHeadingText;

    public WebElement getHoversHeadingText() {

        return  hoversHeadingText;
    }
}
