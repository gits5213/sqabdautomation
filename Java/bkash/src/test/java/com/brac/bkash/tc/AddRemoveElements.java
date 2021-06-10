package com.brac.bkash.tc;

import com.brac.bkash.pages.AddRemoveElementsPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElements extends BaseTest{

    @Test
    public void addRemoveElements(){
        //Navigate to the URL
        // Click on Add/Remove Elements
        LandingPage lp = new LandingPage(driver);
        lp.getAdRemoveElementLink().click();
        sleepTest(1000);

        //Validate Url
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, Data.BASE_URL + "add_remove_elements/");
        sleepTest(1000);

        //Validate header text
        AddRemoveElementsPage arp = new AddRemoveElementsPage(driver);
        String headerText = arp.getAddRemoveElementHeadText().getText();
        Assert.assertEquals(headerText,"Add/Remove Elements");
        sleepTest(2000);

        //Validate Add element button and click
        driver.findElement(By.xpath("//div[@id='content']//button[.='Add Element']")).click();
        String buttonText = arp.getAddButtonText().getText();
        Assert.assertEquals(buttonText, Data.ARP_TEST_VARIATION_1);
        sleepTest(1000);
        //validate delete button and click
        String delButtonText = arp.getDelButtonText().getText();
        Assert.assertEquals(delButtonText, Data.ARP_TEST_VARIATION_2);
        sleepTest(1000);
        driver.findElement(By.xpath("//div[@id='elements']/button[@class='added-manually']")).click();
        //Back
        driver.navigate().back();
        sleepTest(2000);


    }
}

