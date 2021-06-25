package com.brac.bkash.tc;


import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.pages.MouseHoversPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseHoversTest extends BaseTest {

        @Test
        public void mouseHoversTest(){
        LandingPage lp = new LandingPage(driver);
        lp.getMouseHoversTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.HOVERS_URL );
        sleepTest(1000);

        MouseHoversPage mh = new MouseHoversPage(driver);
        String headerText = mh.getMouseHeadingText().getText();
        Assert.assertEquals(headerText, Data.HOVERS_HEADER);
        sleepTest(1000);

        WebElement element = driver.findElement(By.xpath("/html//div[@id='content']/div/div[1]/img[@alt='User Avatar']"));
        WebElement element1 = driver.findElement(By.xpath("/html//div[@id='content']/div/div[2]/img[@alt='User Avatar']"));
        WebElement element2 = driver.findElement(By.xpath("/html//div[@id='content']/div/div[3]/img[@alt='User Avatar']"));
//        WebElement profile1 = driver.findElement(By.xpath("/html//div[@id='content']//a[@href='/users/1']"));
//        WebElement profile2 = driver.findElement(By.xpath("/html//div[@id='content']//a[@href='/users/2']"));
//        WebElement profile3 = driver.findElement(By.xpath("/html//div[@id='content']//a[@href='/users/3']"));

        Actions action = new Actions(driver);

        action.moveToElement(element).perform();
        sleepTest(1000);
//        action.moveToElement(profile1).click();
//        sleepTest(1000);
//        driver.navigate().back();



        action.moveToElement(element1).perform();
        sleepTest(1000);
//        action.moveToElement(profile2).click();
//        sleepTest(1000);
//        driver.navigate().back();

        action.moveToElement(element2).perform();
        sleepTest(1000);
//        action.moveToElement(profile3).click();
//        sleepTest(1000);
//        driver.navigate().back();

        driver.navigate().back();
        sleepTest(1000);


    }
}
