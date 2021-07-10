package com.brac.bkash.MahbubLiveProject.pages;

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

    @FindBy(xpath = "/html//div[@id='content']/div/div[1]/img[@alt='User Avatar']")
    public WebElement profile1;

    public WebElement getProfile1() {
        return profile1;
    }

    @FindBy(xpath = "/html//div[@id='content']/div/div[2]/img[@alt='User Avatar']")
    public WebElement profile2;

    public WebElement getProfile2() {
        return profile2;
    }

    @FindBy(xpath = "/html//div[@id='content']/div/div[3]/img[@alt='User Avatar']")
    public WebElement profile3;

    public WebElement getProfile3() {
        return profile3;
    }

    @FindBy(css = "#content > div > div:nth-child(5) > div > a")
    public WebElement viewProfile3;

    public WebElement getViewProfile3() {
        return viewProfile3;
    }

        @FindBy(css = "div:nth-of-type(2) > .figcaption > a")
        public WebElement viewProfile2;

        public WebElement getViewProfile2() {
            return viewProfile2;
        }

    @FindBy(css = "[href='\\/users\\/1']")
    public WebElement viewProfile1;

    public WebElement getViewProfile1() {
        return viewProfile1;
    }



}
