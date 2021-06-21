package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.HoversPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hovers extends BaseTest {

    @Test
    public void hovers(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getHoversLink().click();
        sleepTest(1000);

        //Validate Frames URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.HOVERS );
        sleepTest(2000);

        //Validate Heading
        HoversPage hp = new HoversPage(driver);
        String headerText = hp.getHoversHeadingText().getText();
        Assert.assertEquals(headerText,Data.HOVERS_HEADER);
        sleepTest(2000);

        //Validate the Hovers user1
        WebElement user1 = driver.findElement(By.xpath("/html//div[@id='content']/div/div[1]/img[@alt='User Avatar']"));
        Actions action = new Actions(driver);
        action.moveToElement(user1).perform();
        sleepTest(2000);

        //Validate the Hovers user2

        WebElement user2 = driver.findElement(By.xpath("/html//div[@id='content']/div/div[2]/img[@alt='User Avatar']"));
        action.moveToElement(user2).perform();
        sleepTest(2000);

        //Validate the Hovers user2
        WebElement user3 = driver.findElement(By.xpath("/html//div[@id='content']/div/div[3]/img[@alt='User Avatar']"));
        action.moveToElement(user3).perform();
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);




    }
}
