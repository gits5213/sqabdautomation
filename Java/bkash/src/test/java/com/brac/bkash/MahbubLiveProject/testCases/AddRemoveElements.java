package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.AddRemoveElementsPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
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
        System.out.println(headerText);
        sleepTest(1000);

        //Validate Add element button and click

        arp.getAddButton.click();
//        driver.findElement(By.xpath("//div[@id='content']//button[.='Add Element']")).click();
        String addButtonText = arp.getAddButtonText().getText();
        Assert.assertEquals(addButtonText, Data.ARP_TEST_VARIATION_1);
        System.out.println(addButtonText);
        sleepTest(1000);
        //validate delete button and click

        String delButtonText = arp.getDelButtonText().getText();
        Assert.assertEquals(delButtonText, Data.ARP_TEST_VARIATION_2);
        System.out.println(delButtonText);
        sleepTest(1000);
        arp.getDelButton().click();
//        driver.findElement(By.xpath("//div[@id='elements']/button[@class='added-manually']")).click();
        //Back
        driver.navigate().back();
        sleepTest(1000);


    }
}

