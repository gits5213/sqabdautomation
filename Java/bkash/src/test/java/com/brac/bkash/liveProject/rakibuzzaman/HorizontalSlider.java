package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.HorizontalSliderPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSlider extends BaseTest {

    @Test
    public void horizontalSlider() {

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getHorizontalSliderLink().click();
        sleepTest(1000);

        //Validate HorizontalSlider URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.HORIZONTAL_SLIDER);
        sleepTest(2000);

        //Validate Heading
        HorizontalSliderPage hsp = new HorizontalSliderPage(driver);
        String headerText = hsp.getHorizontalSliderHeadingText().getText();
        Assert.assertEquals(headerText, Data.HORIZONTAL_SLIDER_HEADER);
        sleepTest(2000);

        //Identify WebElement
        WebElement slider = driver.findElement(By.xpath("/html//div[@id='content']//input[@value='0']"));
        //WebElement output = driver.findElement(By.xpath("/html//span[@id='range']"));

        //Using Action Class

        //Actions action = new Actions(driver);
        //action.dragAndDrop(slider, output).perform();
        //action.dragAndDropBy(slider, 0, 5).release().build().perform();
        //slider.click();
        //sleepTest(2000);


//        action.dragAndDropBy(slider, -1, 0);
//        action.perform();
//        sleepTest(2000);
//        Actions actions = new Actions(driver);
//        actions.clickAndHold(slider);
//        actions.moveToElement(slider,4,0).build().perform();
        //sleepTest(2000);

        //WebElement output = driver.findElement(By.xpath("/html//span[@id='range']"));


        //actions.clickAndHold(output);
        //actions.moveToElement(output,0,3).build().perform();
        //sleepTest(2000);



        Actions act = new Actions(driver);
        Action dragAndDrop = act.clickAndHold(slider).moveByOffset(100,0).release().build();
        dragAndDrop.perform();
        sleepTest(3000);


        //Back
        driver.navigate().back();
        sleepTest(2000);




    }
}
