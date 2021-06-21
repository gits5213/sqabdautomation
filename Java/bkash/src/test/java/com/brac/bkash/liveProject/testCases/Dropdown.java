package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.DropdownPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown extends BaseTest {

    @Test
    public void  dropdown() {

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getDropdownLink().click();
        sleepTest(2000);

        //Validate Dropdown URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DROP_DOWN);
        sleepTest(2000);

        //Validate Heading
        DropdownPage dp = new DropdownPage(driver);
        String headerText = dp.getDropdownHeadingText().getText();
        Assert.assertEquals(headerText, Data.DROP_DOWN_HEADER);
        sleepTest(2000);

        //Selecting Items in a Multiple SELECT elements

        WebElement menu = driver.findElement(By.xpath("/html//select[@id='dropdown']"));

        //Using Select class for selecting value from dropdown
        Select select = new Select(menu);
        select.selectByVisibleText("Option 1");
        sleepTest(2000);

        select.selectByVisibleText("Option 2");
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);




    }

}



