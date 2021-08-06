package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.FileUploadPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest{

    @Test
    public void fileUploadTest (){

        LandingPage lp = new LandingPage(driver);
        lp.getFileUploadTest().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FILE_UPLOAD );
        sleepTest(1000);

        FileUploadPage fileUp = new FileUploadPage(driver);
        String headerText = fileUp.getFileUploadTest().getText();
        Assert.assertEquals(headerText, Data.FILE_UPLOAD_HEADER);
        sleepTest(1000);

        Actions act = new Actions(driver);

        WebElement upload = driver.findElement(By.xpath("/html//input[@id='file-upload']"));
        act.moveToElement(upload).perform();
        sleepTest(1000);


        upload.sendKeys("C:\\Users\\Admin\\Desktop\\Github\\sqabdautomation\\Java\\bkash\\Files\\textFile.txt");
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);
    }
}
