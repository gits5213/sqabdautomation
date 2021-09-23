package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.ContextMenuPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTcAsif extends BaseClass{

    @Test
    public void contextMenuTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        ContextMenuPageAsif cmpa = new ContextMenuPageAsif(driver);

        if ( tilp.getContextNow().isDisplayed() ){
            String contextNow = tilp.getContextNow().getText();
            Assert.assertEquals(Data.CONTEXT_MENU_HEADER, contextNow);
        }

        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        //TC-1. Click on Context Menu Link
        tilp.contextNow.click();
        sleepTest(2000);

        if ( cmpa.contextMenuHead.isDisplayed() ){
            String contextNowHeader = cmpa.getContextMenuHead().getText();
            Assert.assertEquals(Data.CONTEXT_MENU_HEADER, contextNowHeader);
        }

        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //TC-2. Contextmenu paragraph one validation
        if ( cmpa.contextMenuPara1.isDisplayed() ){
            String contextNowPara1 = cmpa.getContextMenuPara1().getText();
            Assert.assertEquals(Data.CONTEXT_MENU_PARA1, contextNowPara1);
        }

        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //TC-3. Contextmenu paragraph one validation
        if ( cmpa.contextMenuPara2.isDisplayed() ){
            String contextNowPara2 = cmpa.getContextMenuPara2().getText();
            Assert.assertEquals(Data.CONTEXT_MENU_PARA2, contextNowPara2);
        }

        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(3000);


        //TC-2. Right click on box
        Actions actions = new Actions(driver);
        //Right Click the button to display Context Menu&nbsp;
        actions.contextClick(cmpa.getHotBox()).perform();
        System.out.println(driver.switchTo().alert().getText());
        sleepTest(5000);

       //TC-3. Accept the Alert
        driver.switchTo().alert().accept();
        System.out.println("Right click Alert Accepted");
        sleepTest(5000);


        driver.navigate().back();
        sleepTest(2000);


    }

}
