package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateCreateNewAccount extends BaseClass {

    @Test
    public  void userAbleToValidateCreateNewAccount ()  {

        //testCase 1. validate create New account button there
        //         2. create new account text is visible there

        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));

        sleepTest(2000);

        if (createNewAccount.isDisplayed())
        {
            System.out.println(createNewAccount.getText());
        }
        else {
            System.out.println(Data.negativeErrorMassage);
        }
        sleepTest(2000);
    }

}
