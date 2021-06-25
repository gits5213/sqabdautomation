package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.DropDownPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {
    @Test
    public void dropDownTest () {

        LandingPage lp = new LandingPage(driver);
        lp.getDropDownTest().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DROP_DOWN );
        sleepTest(2000);

        DropDownPage ddownp = new DropDownPage(driver);
        String headerText = ddownp.getDropDownHeadTest().getText();
        Assert.assertEquals(headerText, Data.DROP_DOWN_HEADER);
        sleepTest(2000);

        WebElement menu = driver.findElement(By.xpath("/html//select[@id='dropdown']"));
        Select select = new Select(menu);
        select.selectByVisibleText("Option 1");
        sleepTest(1000);

        select.selectByVisibleText("Option 2");
        sleepTest(1000);



        driver.navigate().back();
        sleepTest(2000);
    }
}
