package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.FormAuthPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTest {
    @Test
    public void formAuthTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getFormAuthTest().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.LOGIN_URL );
        sleepTest(3000);

        FormAuthPage fap = new FormAuthPage(driver);
        String headerText = fap.getFormAuthTest().getText();
        Assert.assertEquals(headerText, Data.LOGIN_HEADER);
        sleepTest(1000);

        Actions action =new Actions(driver);
        WebElement login = driver.findElement(By.xpath("/html//input[@id='username']"));
        login.sendKeys(Data.LOGIN_USER);
        sleepTest(1000);
        WebElement pass = driver.findElement(By.xpath("/html//input[@id='password']"));
        pass.sendKeys(Data.LOGIN_PASSWORD);
        sleepTest(1000);
        action.perform();


        driver.navigate().back();
        sleepTest(1000);
    }
}
