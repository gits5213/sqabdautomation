package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.NestedFrameValidationPageAsif;
import com.ucb.nagad.internetpages.NestedFrameValidationPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.annotations.Test;

public class NestedFrameValidationTcAsif extends BaseClass{

    @Test
    public void frameValidationTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        NestedFrameValidationPageAsif fvpa = new NestedFrameValidationPageAsif(driver);


        //TC-1. Click on Frame Validation Link
        tilp.getFrameValidation().click();
        sleepTest(2000);


        //TC-2. Click on Nested Frames Link
        fvpa.getNestedFrames().click();
        sleepTest(2000);



        //TC-3. Switch to TOP Frame
        driver.switchTo().frame("frame-top");
        sleepTest(2000);

        //TC-4. Switch to Left Frame
        driver.switchTo().frame("frame-left");
        String leftText = fvpa.getTopLeftMiddleRightBottom().getText();
        System.out.println(leftText);
        sleepTest(2000);



        //TC-5. Switch to TOP Frame
        driver.switchTo().parentFrame();
        sleepTest(2000);

        //TC-6. Switch to Middle Frame
        driver.switchTo().frame("frame-middle");
        sleepTest(2000);
        String middleText = fvpa.getTopLeftMiddleRightBottom().getText();
        System.out.println(middleText);



        //TC-7. Switch to TOP Frame
        driver.switchTo().parentFrame();
        sleepTest(2000);

        //TC-8. Switch to Right Frame
        driver.switchTo().frame("frame-right");
        sleepTest(2000);
        String rightText = fvpa.getTopLeftMiddleRightBottom().getText();
        System.out.println(rightText);



        //TC-9. Switch to TOP Frame
        driver.switchTo().defaultContent();

        //TC-10. Switch to Bottom Frame
        driver.switchTo().frame("frame-bottom");
        sleepTest(2000);
        String bottomText = fvpa.getTopLeftMiddleRightBottom().getText();
        System.out.println(bottomText);


        //TC-11. Navigate to Internet Herokuapp home page.
        driver.navigate().to(Data.BASE_URL);
        sleepTest(3500);
    }
}
