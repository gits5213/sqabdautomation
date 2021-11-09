package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.Data.Data;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.pages.RedirectLinkPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectLink extends BaseTest{

    @Test
    public void redirectLink(){

        LandingPage lp = new LandingPage(driver);
        lp.getRedirectLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.REDIRECT_LINK_URL );
        sleepTest(1000);

        RedirectLinkPage rlp = new RedirectLinkPage(driver);
        String headerText = rlp.getRedirectLinkHeadingText().getText();
        Assert.assertEquals(headerText, Data.REDIRECT_LINK_HEADER);
        sleepTest(1000);

        rlp.getStatusCodePage().click();
        sleepTest(1000);

        rlp.getValidStatusPage().click();
        sleepTest(1000);
        String validURL = driver.getCurrentUrl();
        Assert.assertEquals(validURL, Data.VALID_STATUS );
        System.out.println(validURL);
        rlp.getPageNaviBack().click();
        sleepTest(1000);

        rlp.getPermanentStatusPage().click();
        sleepTest(1000);
        String permanentURL = driver.getCurrentUrl();
        Assert.assertEquals(permanentURL, Data.PERMANENT_REDIRECT_STATUS );
        System.out.println(permanentURL);
        rlp.getPageNaviBack().click();

        rlp.getNotFoundStatusPage().click();
        sleepTest(1000);
        String notFoundURL = driver.getCurrentUrl();
        Assert.assertEquals(notFoundURL, Data.NOT_FOUND_STATUS );
        System.out.println(notFoundURL);
        rlp.getPageNaviBack().click();

        rlp.getServerErrorStatusPage().click();
        sleepTest(1000);
        String serverErrorURL = driver.getCurrentUrl();
        Assert.assertEquals(serverErrorURL, Data.SERVER_ERROR_STATUS );
        System.out.println(serverErrorURL);
        rlp.getPageNaviBack().click();

        driver.navigate().back();
        sleepTest(1000);

    }
}