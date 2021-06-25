package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.InputsPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs extends BaseTest {

    @Test

    public void inputs(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getInputsLink().click();
        sleepTest(1000);

        //Validate Inputs URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.INPUTS );
        sleepTest(2000);

        //Validate Heading
        InputsPage ip = new InputsPage(driver);
        String headerText = ip.getInputsHeadingText().getText();
        Assert.assertEquals(headerText,Data.INPUTS_HEADER);
        sleepTest(2000);


    }
}

