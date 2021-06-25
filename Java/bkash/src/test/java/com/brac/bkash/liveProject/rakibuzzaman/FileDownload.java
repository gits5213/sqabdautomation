package com.brac.bkash.liveProject.rakibuzzaman;

import com.brac.bkash.liveProject.rakibuzzaman.pages.FileDownloadPage;
import com.brac.bkash.liveProject.rakibuzzaman.pages.LandingPage;
import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FileDownload extends BaseTest {


    @Test
    public void fileDownload(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getFileDownloadLink().click();
        sleepTest(1000);

        //Validate ContextMenu URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FILE_DOWNLOAD );
        sleepTest(2000);

        //Validate Heading
        FileDownloadPage fp = new FileDownloadPage(driver);
        String headerText = fp.getFileDownloadHeadingText().getText();
        Assert.assertEquals(headerText,Data.FILE_DOWNLOAD_HEADER);
        sleepTest(2000);

        //Click on Element
        //driver.findElement(By.cssSelector("[href='download\\/some-file\\.txt']")).click();
       // sleepTest(3000);

        WebElement downloadLink = driver.findElement(By.xpath("//div[@id='content']//a[@href='download/webdriverIO.png']"));
        downloadLink.click();
        sleepTest(2000);


        downloadLink.sendKeys("C:\\Users\\ASUS\\Downloads");
        sleepTest(2000);



        //Back
        driver.navigate().back();
        sleepTest(2000);



    }
}
