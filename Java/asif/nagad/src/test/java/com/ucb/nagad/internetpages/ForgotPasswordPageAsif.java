package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPageAsif extends BasePageInt{
    public ForgotPasswordPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy( xpath = "/html//input[@id='email']" )
    public WebElement forgotPasswordEmailBox;
    public WebElement getForgotPasswordEmailBox() {
        return forgotPasswordEmailBox;
    }

    @FindBy ( xpath = "/html//button[@id='form_submit']" )
    public WebElement retrievePassword;
    public WebElement getRetrievePassword() {
        return retrievePassword;
    }
}
