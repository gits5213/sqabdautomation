package com.brac.bkash.tc;

import com.brac.bkash.pages.AbtestPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ABTesting extends BaseTest{

    @Test
    public void aBTesting(){

        LandingPage lp = new LandingPage(driver);
        lp.getAbTestingLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.ABTEST );
        sleepTest(1000);

        AbtestPage ap = new AbtestPage(driver);
        String headerText = ap.getAbTestHeadingText().getText();
        Assert.assertEquals(headerText, Data.AB_TEST_VARIATION_1);
        sleepTest(1000);



        driver.navigate().back();
        sleepTest(1000);
    }

}
