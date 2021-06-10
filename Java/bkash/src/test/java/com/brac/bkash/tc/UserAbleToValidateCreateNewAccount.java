package com.brac.bkash.tc;

import com.brac.bkash.pages.LogInSignUp;
import com.brac.bkash.utilities.Data;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAbleToValidateCreateNewAccount extends BaseTest {

    @Test
    public void userAbleToValidateCreateNewAccount() {

        driver.navigate().to(Data.FACEBOOK_URL);
        LogInSignUp lisp = new LogInSignUp(driver);
        if(lisp.getCreateNewAccount().isDisplayed()){
            String createNewAccountText = lisp.getCreateNewAccount().getText();
            Assert.assertEquals(Data.CREATE_NEW_ACCOUNT_TEST, createNewAccountText);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MESSAGE);
        }
        sleepTest(2000);
    }

}
