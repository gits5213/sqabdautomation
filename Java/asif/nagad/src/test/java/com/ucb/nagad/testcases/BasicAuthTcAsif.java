package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.BasicAuthPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTcAsif extends BaseClass{

    @Test
    public void basicAuthTcAsif(){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        BasicAuthPageAsif bapa = new BasicAuthPageAsif(driver);

        //Tc-1. Click on Add/Remove Elements
        tilp.getBasicAuth().click();
        sleepTest(3000);


        //Tc-2. Providing username & password.
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        sleepTest(3000);


        //Tc-3. Validating Header
        if ( bapa.getBasicAuthHeader().isDisplayed() ){
            String basicheader = bapa.getBasicAuthHeader().getText();
            Assert.assertEquals(Data.BASIC_AUTH_HEADER, basicheader);
        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Tc-4. Validating Paragraph
        if ( bapa.getBasicAuthPara().isDisplayed() ){
            String basicpara = bapa.getBasicAuthPara().getText();
            Assert.assertEquals(Data.BASIC_AUTH_PARA, basicpara);
        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        driver.navigate().back();
        sleepTest(2000);
    }
}
