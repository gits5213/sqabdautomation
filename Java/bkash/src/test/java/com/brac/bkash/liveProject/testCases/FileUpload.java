package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.FileUploadPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload extends BaseTest {

    @Test

    public void fileUpload(){


    //Navigate to the URL
    LandingPage lp = new LandingPage(driver);
    lp.getFileUploadLink().click();
    sleepTest(1000);

    //Validate ContextMenu URL
    String actualURL = driver.getCurrentUrl();
    Assert.assertEquals(actualURL, Data.BASE_URL + Data.FILE_UPLOAD );
    sleepTest(2000);

    //Validate Heading

        FileUploadPage fp = new FileUploadPage(driver);
     String headerText = fp.getFileUploadHeadingText().getText();
     Assert.assertEquals(headerText,Data.FILE_UPLOAD_HEADER);
      sleepTest(2000);

        //WebElement uploadElement = driver.findElement(By.xpath("/html//input[@id='file-upload']"));

        // enter the file path onto the file-selection input field
        //uploadElement.sendKeys("C:\\Users\\ASUS\\Desktop\\Class");
        //sleepTest(2000);


        // click the "UploadFile" button
        //driver.findElement(By.xpath("/html//input[@id='file-submit']")).click();
        //sleepTest(2000);

        // check the "I accept the terms of service" check box
        //driver.findElement(By.xpath("/html//div[@id='drag-drop-upload']")).click();
        //sleepTest(2000);

        WebElement addFile = driver.findElement(By.xpath("/html//input[@id='file-upload']"));
        addFile.sendKeys("C:\\Users\\ASUS\\Desktop\\Class");
        sleepTest(2000);


        // click the "UploadFile" button
        //driver.findElement(By.xpath("/html//input[@id='file-submit']")).click();
        //sleepTest(2000);
        // click the "UploadFile" button
        driver.findElement(By.xpath("/html//input[@id='file-submit']")).click();
        sleepTest(2000);

        //driver.findElement(By.xpath("/html//div[@id='drag-drop-upload']")).click();
        //sleepTest(2000);


        //Back
        driver.navigate().back();
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);






    }
}
