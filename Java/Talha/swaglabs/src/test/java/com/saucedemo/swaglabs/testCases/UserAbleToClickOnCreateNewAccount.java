package com.saucedemo.swaglabs.testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToClickOnCreateNewAccount extends BaseClass {

    @Test
    public  void  userAbleToClickOnCreateNewAccount ()  {

        sleepTest(2000);

        //testCase 1. Click on create New account button

        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
        createNewAccount.click();
        sleepTest(2000);

    }
}
