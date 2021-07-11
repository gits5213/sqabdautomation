package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input#email")
    public WebElement forgotPassword;

    public WebElement getForgotPassword(){
        return forgotPassword;
    }

    @FindBy(css = "button#form_submit > .icon-2x.icon-signin")
    public WebElement retrievePassword;

    public WebElement getRetrievePassword(){
        return retrievePassword;
    }



}
