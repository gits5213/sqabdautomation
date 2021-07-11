package com.brac.bkash.stc;

import com.brac.bkash.Spages.LandingPage;
import org.testng.annotations.Test;

public class DynamicContentTest extends BaseTest{
    @Test
    public void DynamicContentTest(){


        LandingPage lp = new LandingPage(driver);
        lp.getDynamicContentLink().click();
        sleepTest(1000);


        driver.navigate().back();
        sleepTest(1000);


    }

}
