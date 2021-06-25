package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.ContextMenuPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenu extends BaseTest {


    @Test
    public void contextMenu(){

       //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getContextMenuLink().click();
        sleepTest(1000);

        //Validate ContextMenu URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.CONTEXT_MENU );
        sleepTest(2000);

        //Validate Heading
        ContextMenuPage cp = new ContextMenuPage(driver);
        String headerText = cp.getContextMenuHeadingText().getText();
        Assert.assertEquals(headerText,Data.CONTEXT_MENU_HEADER);
        sleepTest(2000);

        // Right click on Context_Menu
        Actions action = new Actions(driver);

        action.contextClick(driver.findElement(By.cssSelector("[oncontextmenu]"))).perform();
       System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);





    }
}
