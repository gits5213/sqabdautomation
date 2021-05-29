package com.brac.bkash.tc;

import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateFirstNameLastNamePresent extends Common{

    @Test
    public void userAbleToValidateFirstNameLastNamePresent() throws InterruptedException {

        WebElement forgetPass = driver.findElement(By.cssSelector("._6ltj > a"));
        forgetPass.click();
        Thread.sleep(   1000);
        WebElement phoneNumber = driver.findElement(By.cssSelector("#identify_email"));
        //Soft assertion
        if(phoneNumber.isEnabled()){
            phoneNumber.sendKeys(Data.phoneNumber);
        }else {
            System.out.println(Data.nagativeErrorMessage);
        }
        sleepTest(2000);
    }

}
