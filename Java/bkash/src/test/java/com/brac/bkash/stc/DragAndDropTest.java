package com.brac.bkash.stc;

import com.brac.bkash.Spages.DragAndDropPage;
import com.brac.bkash.Spages.LandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest
{

    @Test
    public void DragAndDropTest(){

        LandingPage lp= new LandingPage(driver);
        lp.getDragAndDrop().click();sleepTest(1000);


        Actions act = new Actions(driver);
        DragAndDropPage dadp = new DragAndDropPage(driver);
        act.dragAndDrop(dadp.getADragDrop(),dadp.getBDragDrop()).build().perform();
        sleepTest(1000);


        driver.navigate().back();
        sleepTest(1000);


    }


}
