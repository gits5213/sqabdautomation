package com.brac.bkash.tc;

import com.brac.bkash.pages.BasePage;
import com.brac.bkash.pages.ForgotPassword;
import com.brac.bkash.pages.LogInSignUp;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateForgotPasswordLink extends BaseTest {

    @Test//(enabled = false)
    public void userAbleToValidateForgotPasswordLink(){

        LogInSignUp lisu = new LogInSignUp(driver);

        String forgotPasswordLink = lisu.getForgetPass().getText();
        Assert.assertTrue(forgotPasswordLink, true);
        sleepTest(1000);

    }

}
