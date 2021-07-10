package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.DigestAuthPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import org.testng.annotations.Test;

public class DigestAuthTest extends BaseTest{

    @Test
    public void digestAuthTest (){

        LandingPage lp = new LandingPage(driver);
        lp.getDigestAuthTest().click();
        sleepTest(1000);

        DigestAuthPage dap = new DigestAuthPage(driver);
        driver.get("http://admin:admin@http://the-internet.herokuapp.com/digest_auth");
        String successText = dap.getSuccessText().getText();
        //Assert.assertEquals(successText,"Congratulations! You must have the proper credentials.");
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);
    }
}
