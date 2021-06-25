package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.AddRemoveElementsPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

public class AddRemoveElements extends BaseTest {

    @Test
    public void addRemoveElements(){

        LandingPage lp = new LandingPage(driver);
        lp.getAddRemoveElementsLink().click();
        sleepTest(1000);
        //Validate AddRemoveElements URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL +Data.ADD_REMOVE_ELEMENTS );
        sleepTest(1000);


        //Validate Heading
        AddRemoveElementsPage ap = new AddRemoveElementsPage(driver);
        String headerText = ap.getAddRemoveElementsHeadingText().getText();
        Assert.assertEquals(headerText, Data.ADD_REMOVE_ELEMENTS_HEADER);
        sleepTest(2000);


        //Click on Add Element
        driver.findElement(By.cssSelector("[onclick]")).click();
        sleepTest(3000);

        //Click on Delete Element
        driver.findElement(By.cssSelector("[onclick='deleteElement\\(\\)']")).click();
        sleepTest(3000);


        //Back
        driver.navigate().back();
        sleepTest(2000);


    }



}
