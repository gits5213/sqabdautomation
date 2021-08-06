package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.ForgetPasswordPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordTest extends BaseTest{


    @Test
    public void forgetPasswordTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getForgetPasswordTest().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FORGET_PASS );
        sleepTest(1000);

        ForgetPasswordPage forgetpass = new ForgetPasswordPage(driver);
        String headerText = forgetpass.getForgetPasswordPage().getText();
        Assert.assertEquals(headerText, Data.FORGET_PASS_HEADER);
        sleepTest(1000);

        Actions action = new Actions(driver);
        WebElement ele = forgetpass.getEmailSelect();
        ele.sendKeys(Data.EMAIL);
        sleepTest(1000);
        action.perform();

        driver.navigate().back();
        sleepTest(1000);
    }
}
