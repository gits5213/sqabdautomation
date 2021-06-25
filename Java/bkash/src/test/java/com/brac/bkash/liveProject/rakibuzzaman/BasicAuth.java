package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.BasicAuthPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuth extends BaseTest {

    @Test
    public void basicAuth(){

        LandingPage lp = new LandingPage(driver);
        lp.getBasicAuthLink().click();
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
