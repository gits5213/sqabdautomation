package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultiWindowTestPage extends BasePage{
    public MultiWindowTestPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "h3")
    public WebElement multiWindowHeadingText;

    public WebElement getMultiWindowHeadingText() {
        return multiWindowHeadingText;
    }

    @FindBy(xpath = "//div[@id='content']//a[@href='/windows/new']")
    public WebElement newWindow;

    public WebElement getNewWindow() {
        return newWindow;
    }
















}
