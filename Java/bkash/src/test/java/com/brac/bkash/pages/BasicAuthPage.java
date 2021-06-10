package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends BasePage{
    public BasicAuthPage(WebDriver driver) {
        super(driver);}

    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement getSuccessText;

    public WebElement getSuccessText() {
        return getSuccessText;
    }



}
