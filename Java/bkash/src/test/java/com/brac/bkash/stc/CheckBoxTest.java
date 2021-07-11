package com.brac.bkash.stc;

import com.brac.bkash.Spages.CheckBoxPage;
import com.brac.bkash.Spages.LandingPage;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest{
    @Test
    public void checkBoxTest(){


        LandingPage lp = new LandingPage(driver);
        lp.getCheckBoxLink().click();
        sleepTest(2000);

        CheckBoxPage cbp = new CheckBoxPage(driver);

        if(cbp.getCheckBox1().isSelected()){
            System.out.println("Checkbox1 is selected.");
        }
        else {
            cbp.getCheckBox1().click();
            sleepTest(1000);
        }


        if(cbp.getCheckBox2().isSelected()){
            System.out.println("Checkbox2 is selected.");
        }
        else {
            cbp.getCheckBox2().click();
            sleepTest(1000);
        }
        //cbp.getCheckBox2().click();
        //sleepTest(2000);



        driver.navigate().back();
        sleepTest(1000);
    }

}
