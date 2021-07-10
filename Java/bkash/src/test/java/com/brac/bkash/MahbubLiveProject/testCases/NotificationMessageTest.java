package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.Data.Data;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.pages.NotificationMessagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessageTest extends BaseTest {

    @Test
    public void notificationMessageTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getNotificationMessageTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.NOTIFICATION_MESSAGE_URL );
        sleepTest(1000);

        NotificationMessagePage nmp = new NotificationMessagePage(driver);
        String headerText = nmp.getNotificationMessageHeaderText().getText();
        Assert.assertEquals(headerText, Data.NOTIFICATION_MESSAGE_HEADER);
        sleepTest(1000);

        nmp.notificationMessagePageButton.click();
        sleepTest(1000);

        String text = nmp.notificationMessageStatusChange.getText();
        System.out.println("Message is" +  text);
        sleepTest(1000);



        driver.navigate().back();
        sleepTest(1000);
    }
}
