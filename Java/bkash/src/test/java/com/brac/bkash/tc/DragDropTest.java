package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.DragDropPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragDropTest extends BaseTest {
    @Test
    public void dragDropTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getDragDropTest().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DRAG_DROP );
        sleepTest(2000);

        DragDropPage ddp = new DragDropPage(driver);
        String headerText = ddp.getDragDropHeadText().getText();
        Assert.assertEquals(headerText, Data.DRAG_DROP_HEADER);
        sleepTest(2000);

        WebElement src = driver.findElement(By.xpath("/html//div[@id='column-a']"));
        WebElement dest = driver.findElement(By.xpath("/html//div[@id='column-b']"));

        Actions act = new Actions(driver);
//        act.dragAndDrop(src,dest).perform();
//        sleepTest(2000);



        act.clickAndHold(src)
                .pause(Duration.ofSeconds(1))
                .moveToElement(dest)
                .pause(Duration.ofSeconds(1))
                .release()
                .pause(Duration.ofSeconds(1))
                .build()
                .perform();




        driver.navigate().back();
        sleepTest(1000);
    }
}
