package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSingUp extends BasePage {

    public LoginSingUp(WebDriver driver) {
        super(driver);
    }
    //WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
    @FindBy(css = "div:nth-of-type(5) > a[role='button']")
            public WebElement createNewAccount;

    @FindBy(css = "._6ltj > a")
    public WebElement forgotPass;


    public WebElement getCreateNewAccount(){
        return createNewAccount;
    }

    public WebElement getForgotPass(){
                return forgotPass ;
            }


}
