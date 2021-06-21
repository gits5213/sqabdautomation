package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.FormAuthenticationPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthentication extends BaseTest {

    @Test
    public void formAuthentication(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getFormAuthenticationLink().click();
        sleepTest(2000);

        //Validate ForgotPassword URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FORM_AUTHENTICATION);
        sleepTest(2000);

        //Validate Heading
        FormAuthenticationPage fap = new FormAuthenticationPage(driver);
        String headerText = fap.getFormAuthenticationHeadingText().getText();
        Assert.assertEquals(headerText, Data.FORM_AUTHENTICATION_HEADER);
        sleepTest(2000);

        //Validate the user name

        Actions act = new Actions(driver);
        WebElement username = driver.findElement(By.xpath("/html//input[@id='username']"));
        username.sendKeys("tomsmith ");
        sleepTest(2000);

        //Validate the password

        WebElement password = driver.findElement(By.xpath("/html//input[@id='password']"));
        password.sendKeys("SuperSecretPassword");
        sleepTest(2000);
        act.perform();

        //Click on login
        driver.findElement(By.cssSelector("[class='fa fa-2x fa-sign-in']")).click();
        sleepTest(3000);

        //Back
        driver.navigate().back();
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);






    }
}
