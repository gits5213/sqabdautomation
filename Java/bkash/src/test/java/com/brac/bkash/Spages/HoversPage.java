package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoversPage extends BasePage{
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > div:nth-child(3) > img")
    public WebElement mouseHover;

    public WebElement getMouseHover(){
        return mouseHover;
    }

   @FindBy(css = "#content > div > div:nth-child(3) > div > h5")
    public WebElement userId1;

    public WebElement getUserId1() {
        return userId1;

    }

    @FindBy(css = "#content > div > div:nth-child(4) > img")
    public WebElement userId2;

    public WebElement getUserId2() {
        return userId2;

    }


    //@FindBy(XPath (//*[@id='content']/div/div[1]/div/h5)


}
