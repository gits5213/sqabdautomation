package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.pages.MultiWindowTestPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;


public class MultiWindowTesting extends BaseTest {

    @Test
    public void multiWindowTesting() {

        LandingPage lp = new LandingPage(driver);
        lp.getMultiWindowTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.MULTI_WINDOW_URL);
        sleepTest(1000);

        MultiWindowTestPage mwtestp = new MultiWindowTestPage(driver);
        String headerText = mwtestp.getMultiWindowHeadingText().getText();
        Assert.assertEquals(headerText, Data.MULTI_WINDOW_HEADER);
        sleepTest(1000);

        String parent = driver.getWindowHandle();
        System.out.println("Parent Window ID is"+ parent);

        mwtestp.getNewWindow().click();
        sleepTest(2000);

        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total Windows"+count);

        for (String child:allWindows)
        {

            if (!parent.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);

                driver.findElement(By.xpath("//body//h3[.='New Window']"));
                sleepTest(3000);

                driver.close();
            }
        }

        driver.switchTo().window(parent);
        System.out.println("Parent window title is" + driver.getTitle());
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);
    }
}