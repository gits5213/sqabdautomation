package com.brac.bkash.stc;

import com.brac.bkash.Spages.HoversPage;
import com.brac.bkash.Spages.LandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest{

    @Test
    public void HoversTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getHoversLink().click();
        sleepTest(1000);


        HoversPage hp = new HoversPage(driver);
        Actions act = new Actions(driver);
        act.moveToElement(hp.getMouseHover()).build().perform();
        //String hov = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/h5")).getText();
        String hov = hp.getUserId1().getText();
        System.out.println(hov);
        //sleepTest(2000);


        sleepTest(1000);

        act.moveToElement(hp.getUserId2()).build().perform();
        String hov1 = hp.getUserId2().getText();
        System.out.println(hov1);
        //sleepTest(2000);


        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);

    }
}
