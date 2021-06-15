package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthPage extends BasePage{
    public FormAuthPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//div[@id='content']//h2[.='Login Page']")
    public WebElement formAuthTest;

    public WebElement getFormAuthTest() {
        return formAuthTest;
    }
}
