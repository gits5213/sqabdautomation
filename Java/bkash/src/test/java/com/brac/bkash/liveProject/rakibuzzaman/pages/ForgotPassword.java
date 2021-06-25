package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage{

    public ForgotPassword(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#identify_email")
    public WebElement phoneNumber;

    public WebElement getPhoneNumber(){
        return phoneNumber;
    }

}
