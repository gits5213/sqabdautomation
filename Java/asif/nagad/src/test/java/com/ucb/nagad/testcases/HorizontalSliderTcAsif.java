package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.HorizontalSliderPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HorizontalSliderTcAsif extends BaseClass{

    @Test
    public void horizontalSliderTcAsif(){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        HorizontalSliderPageAsif hspa = new HorizontalSliderPageAsif(driver);


        //TC-1. Click on Horizontal Slider Link
        tilp.getHorizontalSlider().click();
        sleepTest(2000);


        //TC-2. Moving the Slider
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(hspa.slider, 20,0).build();
        action.perform();
        sleepTest(3000);


        //TC-3. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(2000);
    }
}
