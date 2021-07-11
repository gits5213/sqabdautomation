package com.brac.bkash.stc;

import com.brac.bkash.Spages.FormAuthenticationPage;
import com.brac.bkash.Spages.LandingPage;
import org.testng.annotations.Test;

public class FormAuthenticationTest extends BaseTest{

    @Test
    public void FormAuthenticationTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getFormAuthenticationLink().click();
        sleepTest(1000);

        FormAuthenticationPage fap = new FormAuthenticationPage(driver);
        fap.getUserName().sendKeys("shakir");
        sleepTest(1000);
        fap.getPassWord().sendKeys("shakir");
        sleepTest(1000);
        fap.getLogIn().click();
        sleepTest(1000);



        driver.navigate().back();
        sleepTest(1000);

    }


}
