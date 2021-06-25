package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > div > h2")
    public WebElement forgotPasswordHeadingText;

    public WebElement getForgotPasswordHeadingText() {

        return forgotPasswordHeadingText;
    }
}
