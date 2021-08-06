package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.FrameTestPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FrameTest extends BaseTest{

    @Test
    public void frameTest() {

        LandingPage lp = new LandingPage(driver);
        lp.getFrameTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FRAME_URL);
        sleepTest(1000);

        FrameTestPage frameTestPage = new FrameTestPage(driver);
        String headerText = frameTestPage.getFrameTestHeadingText().getText();
        Assert.assertEquals(headerText, Data.FRAME_HEADER);
        sleepTest(1000);

//        Validating Frames
        driver.findElement(By.xpath("//div[@id='content']//ul//a[@href='/nested_frames']")).click();

        //Top Frame
        driver.switchTo().frame(0);

        driver.findElement(By.cssSelector("frameset[name='frameset-middle'] > frame[name='frame-middle']")).getText();
        System.out.println("driver.findElement(By.cssSelector(\"frameset[name='frameset-middle'] > frame[name='frame-middle']\")).getText()");



//        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("frame[name='frame-top']")));
//        System.out.println(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("frame"))).size());


        driver.navigate().back();
        sleepTest(1000);


    }
}
