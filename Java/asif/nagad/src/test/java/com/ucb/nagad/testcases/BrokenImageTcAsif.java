package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.BrokenImagesPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BrokenImageTcAsif extends BaseClass{

    @Test
    public void brokenImageTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        //BrokenImagesPageAsif bipa = new BrokenImagesPageAsif(driver);

        if ( tilp.getBrokenImages().isDisplayed() ){
            String brokenImages = tilp.getBrokenImages().getText();
            Assert.assertEquals(Data.BROKEN_IMAGES, brokenImages);
        }

        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-1. Click on Broken Image Link
        tilp.brokenImages.click();
        sleepTest(2000);


        //TC-2. Checking that image is available or not by checking image status code.
        List<WebElement> elementList = driver.findElements(By.tagName("img"));
        for (int i = 0; i < elementList.size(); i++){

            Response response = RestAssured.given().contentType("application/json")
                    .get(elementList.get(i).getAttribute("src"));

            System.out.println("HTTP response is: " + response.getStatusCode());

            if ( elementList.get(i).getAttribute("naturalWidth").equals("0")){
                System.out.println( elementList.get(i).getAttribute("src") + " is broken." );
            }

            else{
                System.out.println( elementList.get(i).getAttribute("src") + " is not broken." );
            }
        }
    }
}
