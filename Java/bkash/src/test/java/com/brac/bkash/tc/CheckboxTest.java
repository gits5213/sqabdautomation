package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.CheckboxPage;
import com.brac.bkash.pages.LandingPage;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void checkboxTest(){

        //Navigate To The URL
        LandingPage lp = new LandingPage(driver);
        lp.getCheckboxTest().click();
        sleepTest(1000);

        //uncheck checkbox 2
        CheckboxPage cb = new CheckboxPage(driver);
        //String headerText = cb.getCheckBox1().getText();
        //Assert.assertEquals(headerText, Data.CHECKBOX_1);
        System.out.println(cb.getCheckBox2().isSelected());
        sleepTest(1000);
        cb.getCheckBox2().click();
        sleepTest(1000);

        //Validating checkbox 1

        //String headerText = cb.getCheckBox1().getText();
        //Assert.assertEquals(headerText, Data.CHECKBOX_1);
        //cb.getCheckBox1().click();
        cb.getCheckBox1().click();
        sleepTest(1000);
        System.out.println(cb.getCheckBox1().isSelected());
        sleepTest(1000);
        cb.getCheckBox1().click();
        sleepTest(1000);


        //Validating checkbox 2
        //String headerText = cb.getCheckBox2().getText();
        //Assert.assertEquals(headerText, Data.CHECKBOX_2);
        //cb.getCheckBox2().click();
        cb.getCheckBox2().click();
        sleepTest(1000);
        System.out.println(cb.getCheckBox2().isSelected());
        sleepTest(1000);
        cb.getCheckBox2().click();
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);
    }
}
