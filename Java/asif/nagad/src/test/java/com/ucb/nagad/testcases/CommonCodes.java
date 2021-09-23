package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.AbTestingPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonCodes extends BaseClass{

    @Test
    public void commonCodes (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        AbTestingPageAsif atpa = new AbTestingPageAsif(driver);


        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.out.println(baseDir);
        System.out.println(chromeDir);


        //TC-1. Click on Multiple Windows Link
        tilp.getAbTesting().click();
        sleepTest(2000);


        //TC-2. Tab Title Validation
        String parentTabTile = driver.getTitle();
        System.out.println("Parent Tab Title is: " + parentTabTile);
        System.out.println("");
        sleepTest(3000);


        //TC-3. URL Validation
        String abTestingHomeUrl = driver.getCurrentUrl();
        System.out.println("Current URL:- " + abTestingHomeUrl);
        Assert.assertEquals( abTestingHomeUrl, Data.AB_URL);
        System.out.println("URL Matched");
        System.out.println("");
        sleepTest(10000);


        //TC-4. URL Validation
        String abTestingConCatHomeUrl = driver.getCurrentUrl();
        System.out.println("Current URL:- " + abTestingConCatHomeUrl);
        Assert.assertEquals( abTestingConCatHomeUrl, Data.BASE_URL+Data.AB_URL_CONCAT);
        System.out.println("URL is right");
        System.out.println("");
        sleepTest(10000);


        //TC-5. Navigate to Internet Herokuapp Home page.
        driver.navigate().back();
        sleepTest(10000);
        System.out.println("At Home Venue");


        //TC-6. Navigate to Home Page
        driver.navigate().to(Data.BASE_URL);
        sleepTest(1000);
        System.out.println("At Home Page");
    }
}
