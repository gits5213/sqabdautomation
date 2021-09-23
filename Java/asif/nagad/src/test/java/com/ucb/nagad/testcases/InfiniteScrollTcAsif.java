package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class InfiniteScrollTcAsif extends BaseClass{

    @Test
    public void infiniteScrollTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);


        //TC-1. Click on Infinite Scroll Link
        tilp.getInfiniteScroll().click();
        sleepTest(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        long intialLength = (long) js.executeScript("return document.body.scrollHeight");

        while(true){
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            sleepTest(4000);

            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
            if(intialLength == currentLength) {
                break;
            }
            intialLength = currentLength;

            //TC-2. Navigate to Internet Herokuapp home page.
            driver.navigate().back();
            sleepTest(2000);
        }
    }
}