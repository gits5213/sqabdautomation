package com.brac.bkash.stc;

import com.brac.bkash.Spages.LandingPage;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest{

    @Test
    public void basicAuthTest(){
        LandingPage lp = new LandingPage(driver);
        lp.getBasicAuthLink().click();
        sleepTest(1000);

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        sleepTest(5000);

        driver.navigate().back();
        sleepTest(1000);
    }

}
