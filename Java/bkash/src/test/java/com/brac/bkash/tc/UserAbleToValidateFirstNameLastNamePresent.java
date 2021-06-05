package com.brac.bkash.tc;

import com.brac.bkash.pages.ForgotPassword;
import com.brac.bkash.pages.LogInSignUp;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateFirstNameLastNamePresent extends BaseTest {

    @Test
    public void userAbleToValidateFirstNameLastNamePresent(){

        driver.navigate().to(Data.FACEBOOK_URL);
        LogInSignUp lisu = new LogInSignUp(driver);
        ForgotPassword fp = new ForgotPassword(driver);

        lisu.getForgetPass().click();
        sleepTest(1000);

        if(fp.getPhoneNumber().isEnabled()){
            fp.getPhoneNumber().sendKeys(Data.PHONE_NUMBER);
        }else {
            System.out.println(Data.NAGATIVE_ERROR_MESSAGE);
        }
        sleepTest(2000);
    }

}
