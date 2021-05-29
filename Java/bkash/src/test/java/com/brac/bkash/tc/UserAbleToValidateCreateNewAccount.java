package com.brac.bkash.tc;

import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateCreateNewAccount extends Common{

    @Test
    public void userAbleToValidateCreateNewAccount() throws InterruptedException {

        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
        if(createNewAccount.isDisplayed()){
            System.out.println(createNewAccount.getText());
        }else {
            System.out.println(Data.nagative_ErrorMessage);
        }
        sleepTest(2000);
    }
}
