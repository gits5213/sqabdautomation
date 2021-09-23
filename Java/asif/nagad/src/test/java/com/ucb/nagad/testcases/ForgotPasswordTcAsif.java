package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.ForgotPasswordPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTcAsif extends BaseClass{

    @Test
    public void forgotPasswordTcAsif(){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        ForgotPasswordPageAsif fppa = new ForgotPasswordPageAsif(driver);


        //TC-1. Click on ForgotPassword at home page of INTERNETHEROKUAPP
        tilp.getForgotPassword().click();
        sleepTest(2000);


        //TC-2. URL Validation
        String forgotPasswordUrl = driver.getCurrentUrl();
        Assert.assertEquals(forgotPasswordUrl, Data.BASE_URL + Data.FORGOT_PASSWORD_URL_CONCAT);
        System.out.println("Hukka Hua URL matched");


        //TC-3. Sending email at email box
        fppa.getForgotPasswordEmailBox().sendKeys("admin123@yopmail.com");
        sleepTest(2000);


        //TC-4. Click on RetrievePassword
        fppa.getRetrievePassword().click();
        sleepTest(2000);
        System.out.println("GaMe OvEr");


        //TC-5. Navigate to ForgotPassword.
        driver.navigate().back();
        sleepTest(2000);

        //TC-6. Clear the email box
        fppa.getForgotPasswordEmailBox().clear();
        sleepTest(2000);


        //TC-7. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(2000);
    }
}
