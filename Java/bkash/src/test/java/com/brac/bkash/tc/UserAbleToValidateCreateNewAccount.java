package com.brac.bkash.tc;

import com.brac.bkash.pages.LogInSignUp;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAbleToValidateCreateNewAccount extends BaseTest {

    @Test
    public void userAbleToValidateCreateNewAccount() {

        LogInSignUp lisp = new LogInSignUp(driver);

        if(lisp.getCreateNewAccount().isDisplayed()){
            String createNewAccountText = lisp.getCreateNewAccount().getText();
            Assert.assertEquals(Data.Create_New_Account_Test, createNewAccountText);
        }else {
            System.out.println(Data.nagative_ErrorMessage);
        }
        sleepTest(2000);
    }

}
