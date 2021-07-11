package com.brac.bkash.tc;

import com.brac.bkash.pages.FileUploadPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
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
        sleepTest(2000);

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

        upload.sendKeys("C:\\Users\\User\\Desktop\\pexels-photo.jpeg");
        sleepTest(2000);

        driver.navigate().back();
        sleepTest(1000);
    }
}
