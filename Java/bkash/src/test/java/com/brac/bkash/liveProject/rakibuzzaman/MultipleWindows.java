package com.brac.bkash.liveProject.rakibuzzaman;
import com.brac.bkash.liveProject.rakibuzzaman.pages.MultipleWindowsPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows extends BaseTest {

    @Test
    public void multipleWindows() {

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getMultipleWindowsLink().click();
        sleepTest(1000);

        //Validate ContextMenu URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.MULTIPLE_WINDOWS);
        sleepTest(2000);

        //Validate Heading
        MultipleWindowsPage mwp = new MultipleWindowsPage(driver);
        String headerText = mwp.getMultipleWindowsHeadingText().getText();
        Assert.assertEquals(headerText, Data.MULTIPLE_WINDOWS_HEADER);
        sleepTest(2000);

        //Validate the new window
        String parentHandle = driver.getWindowHandle();
        System.out.println("parent window -" + parentHandle);
        driver.findElement(By.xpath("//div[@id='content']//a[@href='/windows/new']")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String handle: handles){

            System.out.println(handle);


        }
        //Back
        driver.navigate().back();
        sleepTest(2000);
    }
}
