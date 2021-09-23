package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.AbTestingPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AbTestingTcAsif extends BaseClass {

    @Test
    public void abTestingTcAsif() {

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        AbTestingPageAsif atpa = new AbTestingPageAsif(driver);


        if (tilp.getAbTesting().isDisplayed()) {
            String abTesting = tilp.getAbTesting().getText();
            Assert.assertEquals(Data.AB_TESTING, abTesting);
            System.out.println(abTesting);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        tilp.abTesting.click();
        sleepTest(2000);

        //Validate URL


        //Validate Header
        if (atpa.getAbTestingVariationControl().isDisplayed()) {
            String abtestingheader2 = atpa.getAbTestingVariationControl().getText();
            Assert.assertEquals(Data.AB_TEST_CONTROL_HEADER, abtestingheader2);
            System.out.println(abtestingheader2);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Validate Paragraph
        if (atpa.getAbTestingVariationPara().isDisplayed()) {
            String abTestingVariationPara = atpa.getAbTestingVariationPara().getText();
            Assert.assertEquals(Data.AB_TEST_VARIATION_PARAGRAPH, abTestingVariationPara);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //TC-5. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(2000);

    }
}