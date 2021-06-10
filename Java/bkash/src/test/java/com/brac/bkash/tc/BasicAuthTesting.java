package com.brac.bkash.tc;

import com.brac.bkash.pages.BasicAuthPage;
import com.brac.bkash.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTesting extends BaseTest{

    @Test
    public void basicAuthTesting (){

        BasicAuthPage bap = new BasicAuthPage(driver);

    //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getBasicAuth().click();
        sleepTest(2000);

    //
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        String successText = bap.getSuccessText().getText();
        Assert.assertEquals(successText,"Congratulations! You must have the proper credentials.");

    //Navigate Back
        driver.navigate().back();
        sleepTest(2000);


    }
}
