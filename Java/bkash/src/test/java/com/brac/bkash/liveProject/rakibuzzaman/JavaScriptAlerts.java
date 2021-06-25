package com.brac.bkash.liveProject.rakibuzzaman;
import com.brac.bkash.liveProject.rakibuzzaman.pages.JavaScriptAlertsPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlerts extends BaseTest {

    @Test
    public void javaScriptAlerts(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getJavaScriptAlertsLink().click();
        sleepTest(1000);

        //Validate JavaScriptAlerts URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.JAVA_SCRIPT_ALERTS);
        sleepTest(2000);

        //Validate Heading
        JavaScriptAlertsPage jsp = new JavaScriptAlertsPage(driver);
        String headerText = jsp.getJavaScriptAlertsHeadingText().getText();
        Assert.assertEquals(headerText,Data.JAVA_SCRIPT_ALERTS_HEADER);
        sleepTest(2000);


      //Click on the link to JS Alert

        driver.findElement(By.xpath("//div[@id='content']//ul//button[.='Click for JS Alert']")).click();
       sleepTest(2000);
        Alert alert = driver.switchTo().alert();
        String print = alert.getText();
        System.out.println(print);
        //Click on Ok button
        alert.accept();
        sleepTest(2000);

        //Click on the link to JS Confirm

        driver.findElement(By.xpath("//div[@id='content']//ul//button[.='Click for JS Confirm']")).click();
        sleepTest(2000);
        System.out.println(print);
        //Click on Ok button
        alert.accept();
        sleepTest(2000);


        //Click on the link to JS Prompt

        driver.findElement(By.xpath("//div[@id='content']//ul//button[.='Click for JS Prompt']")).click();
        sleepTest(2000);
        System.out.println(print);
        //Click on Ok button
        alert.accept();
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);






    }
}
