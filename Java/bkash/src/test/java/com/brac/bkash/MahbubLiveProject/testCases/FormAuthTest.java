package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.FormAuthPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTest{
    @Test
    public void formAuthTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getFormAuthTest().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.LOGIN_URL );
        sleepTest(1000);

        FormAuthPage fap = new FormAuthPage(driver);
        String headerText = fap.getFormAuthTest().getText();
        Assert.assertEquals(headerText, Data.LOGIN_HEADER);
        sleepTest(1000);

        fap.getFormAuthUser().sendKeys(Data.LOGIN_USER);
        sleepTest(1000);
        fap.getFormAuthPassword().sendKeys(Data.LOGIN_PASSWORD);
        sleepTest(1000);
        fap.getFormAuthButton().click();
        sleepTest(1000);

        String confirmText = fap.formAuthConfirmText.getText();
        System.out.println("Confirm text is" + confirmText);

        fap.formAuthSignOut.click();


        driver.navigate().back();
        sleepTest(1000);
    }
}
