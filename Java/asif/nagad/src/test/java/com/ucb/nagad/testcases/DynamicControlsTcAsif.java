package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.DynamicControlsPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.openqa.selenium.remote.http.AbstractHttpCommandCodec;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTcAsif extends BaseClass{

    @Test
    public void dynamicControlsTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        DynamicControlsPageAsif dcrpa = new DynamicControlsPageAsif(driver);


        //TC-1. Home URL Validation
        String baseWebAddress = driver.getCurrentUrl();
        Assert.assertEquals(Data.BASE_URL, baseWebAddress);
        sleepTest(3000);
        System.out.println("Home is alright :D ");


        //TC-2. Click on Dynamic Controls Link
        tilp.getDynamicControls().click();
        sleepTest(3000);


        //TC-3. Dynamic Controls URL Validation
        String dynamicControlsUrl = driver.getCurrentUrl();
        Assert.assertEquals(dynamicControlsUrl,Data.BASE_URL + Data.DYNAMIC_CONTROLS_URL_CONCAT);
        sleepTest(3000);
        System.out.println("You are at Dynamic Control Page and URL is validated");

        //TC-4. Click on CheckBox
        dcrpa.getCheckBox().click();
        sleepTest(3000);


        //TC-5. Click on RemoveAddButton to Remove
        dcrpa.getRemoveAddButton().click();
        sleepTest(5000);


        //TC-6. Click on RemoveAddButton to Add
        dcrpa.getRemoveAddButton().click();
        sleepTest(5000);


        //TC-7. Click on EnableDisableButton to ENABLE
        dcrpa.getEnableDisableButton().click();
        sleepTest(3000);


        //TC-8. Send Text/Numeric Value to TEXT BOX
        dcrpa.getTextBoxEnableDisable().sendKeys("বাসায় গেস্ট আবো।");
        sleepTest(5000);


        //TC-9. Click on EnableDisableButton to DISABLE
        dcrpa.getEnableDisableButton().click();
        sleepTest(5000);


        //TC-10. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(3000);
    }
}
