package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.DropDownPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTcAsif extends BaseClass{

    @Test
    public void dropDownTcAsif(){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        DropDownPageAsif ddta = new DropDownPageAsif(driver);


        //TC-1. Click on DropDown
        tilp.getDropDown().click();
        sleepTest(3000);

        //TC-2. URL Validation
        String link  = driver.getCurrentUrl();
        System.out.println("");
        System.out.println(link);
        Assert.assertEquals(link, Data.BASE_URL+Data.DROPDOWN_URL_CONCAT);

        System.out.println("");
        System.out.println("Link is Valid");
        sleepTest(3000);

        //Dropdown content list collection


        //TC-3. Dropdown click & select option activities
        ddta.pleaseSelectAnOption.click();
        sleepTest(3000);


        //TC-4. Select option1
        ddta.optionOne.click();
        sleepTest(3000);
        ddta.pleaseSelectAnOption.click();
        sleepTest(3000);


        //TC-5. Select option2
        ddta.pleaseSelectAnOption.click();
        sleepTest(3000);
        ddta.optionTwo.click();
        sleepTest(3000);
        ddta.pleaseSelectAnOption.click();
        sleepTest(3000);


        //TC-6. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(3000);
    }
}