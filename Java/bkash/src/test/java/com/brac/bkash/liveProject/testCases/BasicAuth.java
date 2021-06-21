package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.BasicAuthPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuth extends BaseTest {

    @Test
    public void basicAuth(){

        LandingPage lp = new LandingPage(driver);
        lp.getBasicAuthTestingLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.BASIC_AUTH );
        sleepTest(1000);


        //
        driver.get ("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        //driver.get(Data.BASE_URL+Data.BASIC_AUTH);
        sleepTest(1000);


        BasicAuthPage bap = new BasicAuthPage(driver);
        String headerText = bap.getBasicAuthHeadingText().getText();
        Assert.assertEquals(headerText,Data.BASIC_AUTH_HEADER);
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);



    }


}
