package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class UserAbleToClickOnForgetPassword extends BaseClass {
    @Test
    public  void userAbleToClickOnForgetPassword ()  {
        WebElement forgetPassword = driver.findElement(By.cssSelector("._6ltj > a"));

        Actions action = new Actions(driver);
        action.moveToElement(forgetPassword).build().perform();
        sleepTest(2000);
        forgetPassword.click();
        sleepTest(2000);
        WebElement phoneNumber = driver.findElement(By.cssSelector("input#identify_email"));
        if(phoneNumber.isEnabled()){
            phoneNumber.sendKeys(Data.phoneNumber);
        }
        else{
            System.out.println(Data.negativeErrorMassage);
        }
        sleepTest(2000);
    }
}
