package com.brac.bkash.stc;

import com.brac.bkash.Spages.ABTestPage;
import com.brac.bkash.Sutilities.S_Data;
import com.brac.bkash.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ABTesting extends BaseTest{


    @Test
    public void aBTesting(){

        LandingPage lp = new LandingPage(driver);
        lp.getAbTestingLink().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, S_Data.BASE_URL + S_Data.AB_TEST);
        sleepTest(1000);

        ABTestPage ap = new ABTestPage(driver);
        String headerText = ap.getAbTestHeaderText().getText();
        Assert.assertEquals(headerText,S_Data.HEADER_TEXT);
        sleepTest(1000);

        String paraText = ap.getParagraphText().getText();
        System.out.println(paraText);
        Assert.assertEquals(paraText,S_Data.PARA_TEXT);
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);



    }

}
