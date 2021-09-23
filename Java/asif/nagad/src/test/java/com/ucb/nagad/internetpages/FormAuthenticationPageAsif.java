package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthenticationPageAsif extends BasePageInt{
    public FormAuthenticationPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//input[@id='username']" )
    public WebElement userNameBox;
    public WebElement getUserNameBox() {
        return userNameBox;
    }

    @FindBy ( xpath = "/html//input[@id='password']" )
    public WebElement passwordBox;
    public WebElement getPasswordBox() {
        return passwordBox;
    }

    @FindBy ( xpath = "//form[@id='login']/button[@class='radius']" )
    public WebElement login;
    public WebElement getLoginButton() {
        return login;
    }

    @FindBy ( xpath = "/html//div[@id='flash']" )
    public WebElement flashAlert;
    public WebElement getFlashAlert() {
        return flashAlert;
    }
}
