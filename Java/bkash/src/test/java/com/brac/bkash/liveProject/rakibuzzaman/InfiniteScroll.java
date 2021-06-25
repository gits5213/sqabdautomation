package com.brac.bkash.liveProject.rakibuzzaman;
import com.brac.bkash.liveProject.rakibuzzaman.pages.InfiniteScrollPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfiniteScroll extends BaseTest {

    @Test
    public void infiniteScroll() {

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getInfiniteScrollLink().click();
        sleepTest(1000);

        //Validate ContextMenu URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.INFINITE_SCROLL);
        sleepTest(2000);

        //Validate Heading
        InfiniteScrollPage isp = new InfiniteScrollPage(driver);
        String headerText = isp.getInfiniteScrollHeadingText().getText();
        Assert.assertEquals(headerText, Data.INFINITE_SCROLL_HEADER);
        sleepTest(2000);

        //Validate the scroll page
        JavascriptExecutor js = (JavascriptExecutor)driver;
        long initialHeight =(long)(js.executeScript("return document.body.scrollHeight"));

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            sleepTest(2000);
            long currentHeight = (long) (js.executeScript("return document.body.scrollHeight"));
            if (initialHeight == currentHeight) {
                break;
            }
        }

        //Back
        driver.navigate().back();
        sleepTest(2000);

    }


}
