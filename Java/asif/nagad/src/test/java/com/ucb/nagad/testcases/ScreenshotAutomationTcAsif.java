package com.ucb.nagad.testcases;


import com.ucb.nagad.utility.Data;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotAutomationTcAsif extends BaseClass{
    //static WebDriver driver;

    @Test
    public void screenshotAutomationTcAsif () throws IOException {

        //WebDriver driver = new FirefoxDriver();

        driver.get(Data.BASE_URL + Data.AB_URL_CONCAT);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\nagad\\src\\test\\java\\com\\ucb\\nagad\\testcases\\abc.jpg"));
        sleepTest(3000);

/*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\nagad/browser/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        takeScreenshot ("Internet_Herokuapp_Page");

    }

    public static void takeScreenshot ( String fileName ) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\nagad\\src\\test\\java\\com\\ucb\\nagad\\testcases"+
                fileName +".jpg"));*/
    }

}
