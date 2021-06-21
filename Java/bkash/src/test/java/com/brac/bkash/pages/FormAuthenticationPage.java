package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthenticationPage extends BasePage{
    public FormAuthenticationPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css="#content > div > h2")
    public WebElement formAuthenticationHeadingText;

    public WebElement getFormAuthenticationHeadingText(){

        return formAuthenticationHeadingText;
    }


}
