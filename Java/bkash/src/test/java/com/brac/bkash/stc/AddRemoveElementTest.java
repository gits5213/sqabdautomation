package com.brac.bkash.stc;

import com.brac.bkash.Spages.AddRemoveElementPage;
import com.brac.bkash.Spages.LandingPage;
import org.testng.annotations.Test;

public class AddRemoveElementTest extends BaseTest{

    @Test
    public void addRemoveElementTest(){
        LandingPage lp = new LandingPage(driver);
        AddRemoveElementPage are = new AddRemoveElementPage(driver);

        lp.getAddRemoveElemetLink().click();
        sleepTest(2000);

        are.getAddElement().click();
        sleepTest(2000);

        are.getDeleteElement().click();
        sleepTest(5000);

        driver.navigate().back();
        sleepTest(1000);

    }
}
