package com.brac.bkash.stc;

import com.brac.bkash.Spages.HorizontalSliderPage;
import com.brac.bkash.Spages.LandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest{

    @Test
    public void HorizontalSliderTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getHorizontalSliderLink().click();
        sleepTest(1000);

        HorizontalSliderPage hsp = new HorizontalSliderPage(driver);
        Actions act = new Actions(driver);
        act.dragAndDropBy(hsp.getHorizontalSlider(),100,0).perform();
        sleepTest(5000);

        String Value = hsp.getSliderValue().getText();
        System.out.println("Value of the Horizontal Slider is:"+Value);
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);

    }

}
