package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.DragAndDropPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTcAsif extends BaseClass{

    @Test
    public void dragAndDropTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        DragAndDropPageAsif ddpa = new DragAndDropPageAsif(driver);


        //TC-1. Click on Drag and Drop Link
        tilp.getDragAndDrop().click();
        sleepTest(3000);


        //TC-2. URL Validation
        String dragAndDropUrl = driver.getCurrentUrl();
        System.out.println("\n");
        System.out.println(dragAndDropUrl);
        Assert.assertEquals(dragAndDropUrl, Data.DRAG_AND_DROP_URL);
        sleepTest(3000);


        //TC-3. Drag n Drop activity
        Actions dragDrop = new Actions(driver);
        dragDrop
                .clickAndHold(ddpa.getDragAndDropA())
                .moveToElement(ddpa.getDragAndDropB())
                .release()
                .build()
                .perform(); // Unable to drop A over B WHY? WHY?? WHY???



        //TC-4. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(3000);
    }
}
