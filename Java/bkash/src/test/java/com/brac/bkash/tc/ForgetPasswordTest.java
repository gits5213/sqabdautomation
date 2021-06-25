package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.ForgetPasswordPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordTest extends BaseTest {


    @Test
    public void forgetPasswordTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getForgetPasswordTest().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FORGET_PASS );
        sleepTest(1000);

        ForgetPasswordPage forgetpass = new ForgetPasswordPage(driver);
        String headerText = forgetpass.getForgetPasswordPage().getText();
        Assert.assertEquals(headerText, Data.FORGET_PASS_HEADER);
        sleepTest(1000);
        Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.cssSelector("#email"));
        ele.sendKeys("mahbubasr88@gmail.com");
        sleepTest(1000);
        action.perform();

        driver.navigate().back();
        sleepTest(1000);
    }
}
