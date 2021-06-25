package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class BrokenImages extends BaseTest {

    @Test
    public void brokenImages() throws IOException {

    //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getBrokenImages().click();
        sleepTest(2000);

    //Image Verification
        List <WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(images.size());

        for (WebElement image:images) {
            String imageSrc = image.getAttribute("src");

            URL url = new URL(imageSrc);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

        if (httpURLConnection.getResponseCode() == 200)
            System.out.println(imageSrc + ">>" + httpURLConnection.getResponseCode() + ">>" + httpURLConnection.getResponseMessage());
        else
            System.err.println(imageSrc + ">>" + httpURLConnection.getResponseCode() + ">>" + httpURLConnection.getResponseMessage());
            httpURLConnection.disconnect();
        }



    //Back
        driver.navigate().back();
        sleepTest(2000);
    }
}
