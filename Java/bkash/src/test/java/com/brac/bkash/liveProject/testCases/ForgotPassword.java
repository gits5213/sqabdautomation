package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.ForgotPasswordPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPassword extends BaseTest {

    @Test
    public void forgotPassword(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getForgotPasswordLink().click();
        sleepTest(2000);

        //Validate ForgotPassword URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FORGOT_PASSWORD);
        sleepTest(2000);

        //Validate Heading
        ForgotPasswordPage fp = new ForgotPasswordPage(driver);
        String headerText = fp.getForgotPasswordHeadingText().getText();
        Assert.assertEquals(headerText, Data.FORGOT_PASSWORD_HEADER);
        sleepTest(2000);

        //Selecting Items in a Multiple SELECT elements

        //WebElement menu = driver.findElement(By.xpath("/html//input[@id='email']"));

        //Using Select class for selecting value from ForgotPassword
        //Select select = new Select(forgotPassword);
        //select.selectByVisibleText("rakib1490@gmail.com");
        //sleepTest(2000);

        //Click on Retrieve password Element
        //driver.findElement(By.cssSelector("[class='icon-2x icon-signin']")).click();
        //sleepTest(3000);

        Actions act = new Actions(driver);
        WebElement menu = driver.findElement(By.cssSelector("#email"));
        menu.sendKeys("rakib1490@gmail.com");
        sleepTest(2000);
        act.perform();

        //Click on Retrieve password Element
        driver.findElement(By.cssSelector("[class='icon-2x icon-signin']")).click();
        sleepTest(3000);
        //Back
        driver.navigate().back();
        sleepTest(2000);



        //Back
        driver.navigate().back();
        sleepTest(2000);





    }
}
