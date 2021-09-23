package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.DigestAuthenticationPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigestAuthenticationTcAsif extends BaseClass{

    @Test
    public void digesAuthenticationTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        DigestAuthenticationPageAsif dapa = new DigestAuthenticationPageAsif(driver);

        //TC-1. Click on DigestAuthentication
        tilp.getDigestAuthentication().click();
        sleepTest(3000);


        //TC-2. Passing id and password
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        sleepTest(2000);


        //TC-3. Validating DigestAuthentication Header
        if ( dapa.getDigestAuthHeader().isDisplayed() ){
            String DigestAuthHeader = dapa.digestAuthHeader.getText();
            Assert.assertEquals( Data.DIGEST_AUTH_HEADER, DigestAuthHeader );
        }

        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        //TC-4. Validating DigestAuthentication Paragraph
        if ( dapa.getDigestAuthPara().isDisplayed() ) {
            String DigestAuthPara = dapa.digestAuthPara.getText();
            Assert.assertEquals(Data.DIGEST_AUTH_PARA,DigestAuthPara);
        }

        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(2000);
        driver.navigate().back();
    }
}
