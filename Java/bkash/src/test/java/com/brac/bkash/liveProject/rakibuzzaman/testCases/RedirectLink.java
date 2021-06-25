package com.brac.bkash.liveProject.rakibuzzaman.testCases;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.RedirectLinkPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectLink extends BaseTest {

    @Test
    public void redirectLink(){

        LandingPage lp = new LandingPage(driver);
        lp.getRedirectLinkLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.REDIRECT_LINK);
        sleepTest(1000);

        RedirectLinkPage rlp = new RedirectLinkPage(driver);
        String headerText = rlp.getRedirectLinkHeadingText().getText();
        Assert.assertEquals(headerText,Data.REDIRECT_LINK_HEADER);
        sleepTest(2000);
        //Click on the Link
        driver.findElement(By.cssSelector("#redirect")).click();
        sleepTest(3000);
        //Validate the 200
        driver.findElement(By.xpath("//div[@id='content']//ul//a[@href='status_codes/200']")).getText();







    }
}
