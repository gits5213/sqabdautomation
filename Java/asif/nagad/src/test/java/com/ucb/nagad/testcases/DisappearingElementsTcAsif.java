package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.DisappearingElementsPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearingElementsTcAsif extends BaseClass {

    @Test
    public void disappearingElementsTcAsif() {

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        DisappearingElementsPageAsif depa = new DisappearingElementsPageAsif(driver);

        //TC-1. Click on Disappearing Element
        tilp.getDisappearingElements().click();
        sleepTest(3000);


        //TC-2. URL Validation
        String disappearingElementsHomeUrl = driver.getCurrentUrl();
        System.out.println(disappearingElementsHomeUrl);
        Assert.assertEquals( disappearingElementsHomeUrl, Data.DISAPPEARING_ELEMENTS_HOME);
        sleepTest(3000);


        //TC-3. Click on Home
        depa.getHome().click();
        sleepTest(2000);


        //TC-4. Click on Disappearing Element
        tilp.getDisappearingElements().click();
        sleepTest(2000);


        //TC-5. Click on About
        depa.getAbout().click();
        sleepTest(2000);


        //TC-6. URL Validation
        String disappearingElementsAboutUrl = driver.getCurrentUrl();
        System.out.println("\n");
        System.out.println(disappearingElementsAboutUrl);
        Assert.assertEquals(Data.DISAPPEARING_ABOUT, disappearingElementsAboutUrl);
        sleepTest(3000);


        //TC-7. Navigate to Disappearing Element Page
        driver.navigate().back();
        sleepTest(3000);


        //TC-8. Click on ContactUs page
        depa.getContactUs().click();
        sleepTest(3000);


        //TC-9. URL Validation
        String disappearingElementsContactUsUrl = driver.getCurrentUrl();
        System.out.println("\n");
        System.out.println(disappearingElementsContactUsUrl);
        Assert.assertEquals(Data.DISAPPEARING_CONTACT_US, disappearingElementsContactUsUrl);
        sleepTest(3000);


        //TC-10. Navigate to Disappearing Element Page
        driver.navigate().back();
        sleepTest(3000);


        //TC-11. Click on the Portfolio page
        depa.getPortfolio().click();
        sleepTest(3000);


        //TC-12. URL Validation
        String disappearingElementsPortfolioUrl = driver.getCurrentUrl();
        System.out.println("\n");
        System.out.println( disappearingElementsPortfolioUrl );
        Assert.assertEquals(Data.DISAPPEARING_PORTFOLIO, disappearingElementsPortfolioUrl);
        sleepTest(3000);


        //TC-13. Navigate to Disappearing Element Page
        driver.navigate().back();
        sleepTest(3000);


        //TC-14. Going to Validate GALLERY page
        if (depa.getGallery().isDisplayed()) { //ELSE IS NOT WORKING FOR GALLERY WHY? WHY?? WHY???

            String galleryWord = depa.getGallery().getText();
            Assert.assertEquals(Data.DISAPPEARING_GALLERY_WORD, galleryWord);
            System.out.println("\n");
            System.out.println(galleryWord);
            sleepTest(3000);

            depa.getGallery().click();
            sleepTest(3000);

            String disappearingElementsGalleryUrl = driver.getCurrentUrl();
            System.out.println("\n");
            System.out.println(disappearingElementsGalleryUrl);
            Assert.assertEquals(Data.DISAPPEARING_GALLERY, disappearingElementsGalleryUrl);
            sleepTest(3000);
        }

        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        //TC-15. Navigate to Internet Herokuapp home page.
        driver.navigate().to(Data.BASE_URL);
        sleepTest(3000);
    }
}
