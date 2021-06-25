package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.FramesPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Frames extends BaseTest {

    @Test
    public void frames(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getFramesLink().click();
        sleepTest(1000);

        //Validate Frames URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FRAMES );
        sleepTest(2000);

        //Validate Heading
        FramesPage fp = new FramesPage(driver);
        String headerText = fp.getFramesHeadingText().getText();
        Assert.assertEquals(headerText,Data.FRAMES_HEADER);
        sleepTest(2000);

        //Validate Nested Frames
        WebElement NestedFrames = driver.findElement(By.xpath("//div[@id='content']//ul//a[@href='/nested_frames']"));
        NestedFrames.click();
        driver.switchTo().frame("LEFT");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        driver.switchTo().frame("MIDDLE");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        driver.switchTo().frame("RIGHT");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        driver.switchTo().frame("BOTTOM");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        sleepTest(2000);






        // driver.switchTo().frame(NestedFrames);
        //sleepTest(2000);
        //driver.switchTo().defaultContent();


        //validate iframe
        //WebElement iframeElement = driver.findElement(By.xpath("//div[@id='content']//ul//a[@href='/iframe']"));
        //iframeElement.click();
        //now using the switch command







        //Back
        driver.navigate().back();
        sleepTest(2000);









    }
}
