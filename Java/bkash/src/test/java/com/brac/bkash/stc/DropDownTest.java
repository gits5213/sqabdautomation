package com.brac.bkash.stc;

import com.brac.bkash.Spages.DropDownPage;
import com.brac.bkash.Spages.LandingPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest{

    @Test
    public void DropDownTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getDropDownLink().click();
        sleepTest(2000);


        DropDownPage ddp = new DropDownPage(driver);
        Select select = new Select(ddp.getDropDown());
        select.selectByValue("1");
        sleepTest(2000);
        select.selectByValue("2");
        sleepTest(2000);


        driver.navigate().back();
        sleepTest(1000);

    }


}
