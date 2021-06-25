package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.DragAndDropPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {

    @Test
    public void dragAndDrop(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getDragAndDropLink().click();
        sleepTest(1000);

        //Validate DragAndDrop URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,Data.BASE_URL + Data.DRAG_AND_DROP);
        sleepTest(2000);

        //Validate Heading
        DragAndDropPage cp = new DragAndDropPage(driver);
        String headerText = cp.getDragAndDropHeadingText().getText();
        Assert.assertEquals(headerText,Data.DRAG_AND_DROP_HEADER);
        sleepTest(2000);

        //Validate Drag and Drop Box
        //Actions action = new Actions(driver);
        //WebElement src = driver.findElement(By.xpath("/html//div[@id='column-a']"));
        //WebElement dest = driver.findElement(By.xpath("/html//div[@id='column-b']"));
        //action.dragAndDrop(src,dest).build().perform();
        //sleepTest(5000);


        //Using Action class for drag and drop.
        //Actions act=new Actions(driver);

        //Element which needs to drag.
        //WebElement From=driver.findElement(By.xpath("/html//div[@id='column-a']"));

        //Element on which need to drop.
       //WebElement To=driver.findElement(By.xpath("/html//div[@id='column-b']"));

        //Dragged and dropped.
        //act.dragAndDrop(From, To).build().perform();
        //sleepTest(2000);


        Actions actions = new Actions(driver);

        WebElement srcElement = driver.findElement(By.xpath("/html//div[@id='column-a']"));
        WebElement targetElement = driver.findElement(By.xpath("/html//div[@id='column-b']"));
        actions.dragAndDrop(srcElement, targetElement).perform();
        sleepTest(2000);


        actions.clickAndHold(srcElement);
        sleepTest(1000);
        actions.moveToElement(targetElement);
        sleepTest(1000);
        actions.release();
        sleepTest(1000);
        actions.build();
        actions.perform();


        //Back
        driver.navigate().back();
        sleepTest(2000);








    }


}

