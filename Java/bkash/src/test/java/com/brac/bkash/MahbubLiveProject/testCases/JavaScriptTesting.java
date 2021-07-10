package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.JavaScriptTestPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptTesting extends BaseTest{

    @Test
    public void javaScriptTesting() {


        LandingPage lp = new LandingPage(driver);
        lp.getJavaScriptTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.JAVA_SCRIPT_URL );
        sleepTest(1000);

        JavaScriptTestPage jstp = new JavaScriptTestPage(driver);
        String headerText = jstp.getJavaScriptHeadingText().getText();
        Assert.assertEquals(headerText, Data.JAVA_SCRIPT_HEADER);
        sleepTest(1000);

//        WebElement result = driver.findElement(By.cssSelector("#result"));

//        driver.findElement(By.cssSelector("[onclick='jsAlert\\(\\)']")).click();
        jstp.getJsAlertText().click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        sleepTest(2000);
        System.out.println(jstp.getResultText().getText());

//        driver.findElement(By.cssSelector("[onclick='jsConfirm\\(\\)']")).click();
        jstp.getJsConfirmText().click();
        System.out.println(alert.getText());
        alert.accept();
        sleepTest(2000);
        System.out.println(jstp.getResultText().getText());

//        driver.findElement(By.cssSelector("[onclick='jsPrompt\\(\\)']")).click();
        jstp.getJsPromptText().click();
        System.out.println(alert.getText());
        alert.sendKeys(Data.NAME);
        sleepTest(1000);
        alert.accept();
        sleepTest(2000);
        System.out.println(jstp.getResultText().getText());



        //Navigate Back
        driver.navigate().back();
        sleepTest(1000);

    }
}
