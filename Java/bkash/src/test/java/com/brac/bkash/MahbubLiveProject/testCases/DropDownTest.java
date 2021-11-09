package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.DropDownPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest{
    @Test
    public void dropDownTest () {

        LandingPage lp = new LandingPage(driver);
        lp.getDropDownTest().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DROP_DOWN );
        sleepTest(1000);

        DropDownPage ddownp = new DropDownPage(driver);
        String headerText = ddownp.getDropDownHeadTest().getText();
        Assert.assertEquals(headerText, Data.DROP_DOWN_HEADER);
        sleepTest(1000);

        WebElement menu = ddownp.getDropDownMenu();
        Select select = new Select(menu);
        select.selectByVisibleText("Option 1");
        sleepTest(1000);

        select.selectByVisibleText("Option 2");
        sleepTest(1000);



        driver.navigate().back();
        sleepTest(1000);
    }
}
