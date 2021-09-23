package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.NotificationMessagesPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.testng.annotations.Test;

public class NotificationMessagesTcAsif extends BaseClass{

    @Test
    public void notificationMessagesTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        NotificationMessagesPageAsif nmpa = new NotificationMessagesPageAsif(driver);


        //TC-1. Click on Multiple Windows Link
        tilp.getNotificationMessages().click();
        sleepTest(2000);


        //TC-2. Click on Click Here
        nmpa.getClickHereLink().click();
        sleepTest(2000);


        //TC-3. Get Flash Alert Text
        String flAlertOne = nmpa.getFlashAlertMessage().getText();
        System.out.println(flAlertOne);
        sleepTest(2500);


        //TC-4. Click on Click Here
        nmpa.getClickHereLink().click();
        sleepTest(2000);


        //TC-5. Get Flash Alert Text
        String flAlertTwo = nmpa.getFlashAlertMessage().getText();
        System.out.println(flAlertTwo);
        sleepTest(2500);


        //TC-6. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(2500);
    }
}
