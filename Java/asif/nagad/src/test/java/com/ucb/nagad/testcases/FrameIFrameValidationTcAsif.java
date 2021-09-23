package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.FrameIFrameValidationPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.testng.annotations.Test;

public class FrameIFrameValidationTcAsif extends BaseClass{

    @Test
    public void frameIFrameValidationTcAsif(){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        FrameIFrameValidationPageAsif fifvpa = new FrameIFrameValidationPageAsif(driver);


        //TC-1. Click on Frame Validation Link
        tilp.getFrameValidation().click();
        sleepTest(2000);


        //TC-2. Click on i-Frame Validation Link
        fifvpa.getiFrame().click();
        sleepTest(2000);


        //TC-3. Catch and Switch to Text Editor
        driver.switchTo().frame("mce_0_ifr");
        fifvpa.getTextBox().clear();
        sleepTest(2000);


        //TC-4. Sending Text in TextBox
        fifvpa.getTextBox().sendKeys("Hello Guys");
        sleepTest(5000);


        //TC-5. Coming out from Text Editor Frame
        driver.switchTo().defaultContent();


        //TC-5. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(3000);
    }
}
