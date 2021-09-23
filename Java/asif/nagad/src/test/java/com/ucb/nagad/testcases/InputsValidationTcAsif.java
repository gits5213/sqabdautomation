package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.InputsValidationPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.testng.annotations.Test;

public class InputsValidationTcAsif extends BaseClass {

    @Test
    public void inputsValidationTcAsif() {

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        InputsValidationPageAsif ivpa = new InputsValidationPageAsif(driver);


        //TC-1. Click on Inputs Validation Link
        tilp.getInputsValidation().click();
        sleepTest(2000);


        //TC-2. Sending Number
        ivpa.getInputField().sendKeys("987654321");
        sleepTest(2000);


        //TC-3. Clear the Input field
        ivpa.getInputField().clear();
        sleepTest(2000);


        //TC-4. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(2000);

    }
}