package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.Data.Data;
import com.brac.bkash.MahbubLiveProject.pages.CheckboxPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest{

    @Test
    public void checkboxTest(){

        //Navigate To The URL
        LandingPage lp = new LandingPage(driver);
        lp.getCheckboxTest().click();
        sleepTest(1000);

        //uncheck checkbox 2
        CheckboxPage cb = new CheckboxPage(driver);
        String headerText = cb.getCheckBox1().getText();
        Assert.assertEquals(headerText, Data.CHECKBOX_1);
        sleepTest(1000);
        cb.getCheckBox2().click();
        sleepTest(1000);

        //Validating checkbox 1

        String chk1Text = cb.getCheckBox1().getText();
        Assert.assertEquals(chk1Text, Data.CHECKBOX_1);
        cb.getCheckBox1().click();
        cb.getCheckBox1().click();
        sleepTest(1000);
        cb.getCheckBox1().click();
        sleepTest(1000);


        //Validating checkbox 2
        String chk2Text = cb.getCheckBox2().getText();
        Assert.assertEquals(chk2Text, Data.CHECKBOX_2);
        cb.getCheckBox2().click();
        cb.getCheckBox2().click();
        sleepTest(1000);
        cb.getCheckBox2().click();
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);
    }
}
