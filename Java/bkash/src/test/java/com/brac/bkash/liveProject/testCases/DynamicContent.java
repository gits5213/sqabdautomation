package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.DynamicContentPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicContent extends BaseTest {

    @Test
    public void dynamicContent(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getDynamicContentLink().click();
        sleepTest(1000);

        //Validate DynamicContent URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DYNAMIC_CONTENT );
        sleepTest(2000);

        //Validate Heading
        DynamicContentPage dp = new DynamicContentPage(driver);
        String headerText = dp.getDynamicContentHeadingText().getText();
        Assert.assertEquals(headerText,Data.DYNAMIC_CONTENT_HEADER);
        sleepTest(2000);

        //Validate the Click here
        driver.findElement(By.cssSelector("[href='\\/dynamic_content\\?with_content\\=static']")).click();
        sleepTest(3000);

        //Back
        driver.navigate().back();
        sleepTest(2000);




    }
}
