package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.RedirectLinkPageAsif;
import com.ucb.nagad.internetpages.RedirectLinkStatusPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.annotations.Test;

public class RedirectLinkTcAsif extends BaseClass{

    @Test
    public void redirectLinkTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        RedirectLinkPageAsif rlpa = new RedirectLinkPageAsif(driver);
        RedirectLinkStatusPageAsif rlspa = new RedirectLinkStatusPageAsif(driver);


        //TC-1. Click on RedirectLink
        tilp.getRedirectLink().click();
        sleepTest(2000);


        //TC-2. Click on Click Here
        rlpa.getClickHereLink().click();
        sleepTest(2500);


        //TC-3. Click on Status Code-> 200
        rlspa.getTwoHundred().click();
        sleepTest(2500);
        System.out.println("Clicked 200");


        //TC-4. Navigate to Status Code Page
        rlspa.getStatusCode().click();
        sleepTest(3500);
        System.out.println();
        System.out.println("Status Code is 200.");
        System.out.println();


        //TC-5. Click on Status Code-> 301
        rlspa.getThreeHundredOne().click();
        sleepTest(2500);
        System.out.println("Clicked 301");


        //TC-6. Navigate to Status Code Page
        rlspa.getStatusCode().click();
        sleepTest(3500);
        System.out.println("Status Code is 301.");
        System.out.println();


        //TC-7. Click on Status Code-> 404
        rlspa.getFourHundredFour().click();
        sleepTest(2500);
        System.out.println("Clicked 404");


        //TC-8. Navigate to Status Code Page
        rlspa.getStatusCode().click();
        sleepTest(3500);
        System.out.println("Status Code is 404.");
        System.out.println();


        //TC-9 Click on Status Code-> 500
        rlspa.getFiveHundred().click();
        sleepTest(2500);
        System.out.println();
        System.out.println("Clicked 500");


        //TC-10. Navigate to Status Code Page
        rlspa.getStatusCode().click();
        sleepTest(3500);
        System.out.println("Status Code is 500.");
        System.out.println();


        //TC-11. Navigate to Home Page
        driver.navigate().to(Data.BASE_URL);
        sleepTest(3500);

    }

}
