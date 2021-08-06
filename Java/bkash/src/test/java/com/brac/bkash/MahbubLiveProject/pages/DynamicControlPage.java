package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlPage extends BasePage{
    public DynamicControlPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".example > h4:nth-of-type(1)")
    public WebElement dynamicControlHeadingText;

    public WebElement getDynamicControlHeadingText() {
        return dynamicControlHeadingText;
    }

    @FindBy(css = "p")
    public WebElement dynamicControlParagraphText;

    public WebElement getDynamicControlParagraphText() {
        return dynamicControlParagraphText;
    }








}
