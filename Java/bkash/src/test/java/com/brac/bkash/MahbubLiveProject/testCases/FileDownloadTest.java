package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.Data.Data;
import com.brac.bkash.MahbubLiveProject.pages.FileDownloadPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class FileDownloadTest{

    @Test
    public void fileDownloadTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        String downloadPath = System.getProperty("user.dir");

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);

        options.setExperimentalOption("prefs",chromePrefs);

        String baseDir = System.getProperty("user.dir");

        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDir);

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='content']/ul//a[@href='/download']")).click();
        driver.findElement(By.xpath("//div[@id='content']//a[@href='download/some-file.txt']")).click();

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FILE_DOWNLOAD );
        Thread.sleep(2000);

        FileDownloadPage fileDownload = new FileDownloadPage(driver);
        String headerText = fileDownload.getFileDownloadTest().getText();
        Assert.assertEquals(headerText, Data.FILE_DOWNLOAD_HEADER);
        Thread.sleep(2000);

        File filePathUpdated = new File(downloadPath+"\\some-file.txt");

        Assert.assertTrue(filePathUpdated.exists());

        if(filePathUpdated.exists()) {

            filePathUpdated.delete();

        }


        driver.navigate().back();
        Thread.sleep(1000);

        driver.quit();

    }
}
