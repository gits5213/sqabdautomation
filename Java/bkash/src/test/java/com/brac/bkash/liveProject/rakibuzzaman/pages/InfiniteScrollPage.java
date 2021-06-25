package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfiniteScrollPage extends BasePage{
    public InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#content > div > h3")
    public WebElement infiniteScrollHeadingText;

    public WebElement getInfiniteScrollHeadingText() {

        return  infiniteScrollHeadingText;
    }
}
