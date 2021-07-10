package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputPage extends BasePage{
    public InputPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "h3")
    public WebElement inputHeadingText;

    public WebElement getInputHeadingText() {
        return inputHeadingText;
    }

    @FindBy(xpath = "/html//div[@id='content']//input[@type='number']")
    public WebElement inputBox;

    public WebElement getInputBox() {
        return inputBox;
    }



}
