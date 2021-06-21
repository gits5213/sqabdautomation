package com.brac.bkash.liveProject.testCases;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.pages.NotificationMessagesPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessages extends BaseTest {

    @Test
    public void notificationMessages(){


        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getNotificationMessagesLink().click();
        sleepTest(1000);

        //Validate Inputs URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.NOTIFICATION_MESSAGES );
        sleepTest(2000);

        //Validate Heading
        NotificationMessagesPage nmp = new NotificationMessagesPage(driver);
        String headerText = nmp.getNotificationMessagesHeadingText().getText();
        Assert.assertEquals(headerText,Data.NOTIFICATION_MESSAGES_HEADER);
        sleepTest(2000);
        //Click on the Link
        Actions action = new Actions(driver);
//        action.contextClick(driver.findElement(By.xpath("/html//div[@id='content']//a[@href='/notification_message']"))).click();
//        sleepTest(2000);


        WebElement element = driver.findElement(By.xpath("/html//div[@id='content']//a[@href='/notification_message']"));
        action.click();
        sleepTest(2000);
        action.contextClick(element);
        sleepTest(2000);

        WebElement element1 = driver.findElement(By.xpath("/html//div[@id='flash']"));
//        Alert alert = driver.switchTo().alert();
//        String alertMessage = driver.switchTo().alert().getText();
//        System.out.println(alert.getText());
        sleepTest(2000);
//        alert.accept();
//        sleepTest(5000);




    }
}
