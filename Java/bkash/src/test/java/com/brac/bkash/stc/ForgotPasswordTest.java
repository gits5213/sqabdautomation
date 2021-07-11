package com.brac.bkash.stc;

import com.brac.bkash.Spages.ForgotPasswordPage;
import com.brac.bkash.Spages.LandingPage;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest{

    @Test
    public void ForgotPasswordTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getForgotPasswordLink().click();
        sleepTest(1000);


        ForgotPasswordPage fpp = new ForgotPasswordPage(driver);
        fpp.getForgotPassword().sendKeys("shakircse10@gmail.com");
        sleepTest(2000);
        fpp.getRetrievePassword().click();
        sleepTest(1000);


        driver.navigate().back();
        sleepTest(1000);


    }

}
