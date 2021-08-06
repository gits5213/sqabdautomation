package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.Data.Data;
import com.brac.bkash.MahbubLiveProject.pages.DynamicControlPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControl extends BaseTest{

    @Test
    public void dynamicControl(){

        LandingPage lp = new LandingPage(driver);
        lp.getDynamicControlLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DYNAMIC_CONTROLS_URL );
        sleepTest(1000);

        //Validate header text
        DynamicControlPage dcp = new DynamicControlPage(driver);
        String headerText = dcp.getDynamicControlHeadingText().getText();
        Assert.assertEquals(headerText, Data.DYNAMIC_CONTROLS_HEADER);
        sleepTest(1000);

        String paraText = dcp.getDynamicControlParagraphText().getText();
        Assert.assertEquals(paraText, Data.DYNAMIC_CONTROLS_PARATEXT);
        sleepTest(1000);

        driver.findElement(By.xpath("//div[@id='checkbox']/input[@label='blah']")).click();
        driver.findElement(By.xpath("//form[@id='checkbox-example']/button[@type='button']")).click();

        driver.findElement(By.xpath("//form[@id='checkbox-example']/button[@type='button']")).click();


        driver.findElement(By.xpath("//form[@id='input-example']/button[@type='button']")).click();
        sleepTest(1000);
        driver.findElement(By.xpath("//form[@id='input-example']/input[@type='text']")).sendKeys(Data.PHONE_NUMBER);
        sleepTest(1000);




    }
}
