package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthenticationPage extends BasePage{
    public FormAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#username")
    public WebElement userName;
    public WebElement getUserName(){
        return userName;
    }
    @FindBy(css = "#password")
    public WebElement passWord;
    public WebElement getPassWord(){
        return passWord;
    }

    @FindBy(css = "#login > button")
    public WebElement logIn;
    public WebElement getLogIn(){
        return logIn;
    }


}
