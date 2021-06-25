package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInSignUp extends BasePage{

    public LogInSignUp(WebDriver driver) {
        super(driver);
    }
    //WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));

    @FindBy(css = "div:nth-of-type(5) > a[role='button']")
    public WebElement createNewAccount;

    @FindBy(css = "._6ltj")
    public WebElement forgetPass;



    public WebElement getCreateNewAccount(){
        return createNewAccount;
    }
    public WebElement getForgetPass(){
        return forgetPass;
    }

}
