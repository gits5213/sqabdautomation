package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.CheckBoxPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTcAsif extends BaseClass{

    @Test
    public void checkBoxTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        CheckBoxPageAsif cbpa = new CheckBoxPageAsif(driver);


        //TC-1. Click on Checkbox at Home page
        if ( tilp.getCheckBox().isDisplayed() ){
            String checkBoxes = tilp.getCheckBox().getText();
            Assert.assertEquals(Data.CHECK_BOXES,checkBoxes);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }



        //TC-2. Check on checkbox1
        tilp.checkBox.click();
        sleepTest(3000);



        //TC-3. Validating Checkbox1
        boolean isSelected = cbpa.checkBox1.isSelected();
        if ( isSelected == false ){
            cbpa.checkBox1.click();
            System.out.println(Data.CHECK_BOX_1);
        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(3000);



        //TC-4. Un Check the Check Box1
        cbpa.checkBox1.click();
        sleepTest(3000);



        //TC-5. Validating Checkbox2
        boolean isSelected2 = cbpa.checkBox2.isSelected();
        if ( isSelected2 == true ){
            cbpa.checkBox2.click();
            System.out.println(Data.CHECK_BOX_2);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(3000);



        //TC-6. Un Check the Check Box
        cbpa.checkBox2.click();
        sleepTest(3000);


        driver.navigate().back();
        sleepTest(2000);

    }
}