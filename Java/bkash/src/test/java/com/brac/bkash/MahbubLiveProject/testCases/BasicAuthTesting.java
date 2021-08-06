package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.BasicAuthPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTesting extends BaseTest{

    @Test
    public void basicAuthTesting (){

        BasicAuthPage bap = new BasicAuthPage(driver);

    //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getBasicAuth().click();
        sleepTest(1000);

    //
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        String successText = bap.getSuccessText().getText();
        Assert.assertEquals(successText,"Congratulations! You must have the proper credentials.");
        System.out.println(successText);

    //Navigate Back
        driver.navigate().back();
        sleepTest(1000);


    }
}
