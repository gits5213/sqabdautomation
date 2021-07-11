package com.brac.bkash.stc;

import com.brac.bkash.Spages.ContextMenuPage;
import com.brac.bkash.Spages.LandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest{

    @Test
    public void ContextMenuTest(){

        LandingPage lp = new LandingPage(driver);

        lp.getContextMenuLink().click();
        sleepTest(1000);

        ContextMenuPage cmp = new ContextMenuPage(driver);
        String headerText = cmp.getContextMenuHeaderText().getText();
        System.out.println(headerText);
        sleepTest(3000);


        Actions act = new Actions(driver);
        act.contextClick(cmp.getContextMenu()).perform();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        driver.switchTo().alert().accept();
        sleepTest(2000);

        cmp.getContextMenu().click();
        sleepTest(5000);



        driver.navigate().back();
    }
}
