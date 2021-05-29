package com.brac.bkash.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Common {
    public WebDriver driver;

    //Kiss & Dry
    // Keep it simple
    //Do not repeat again

    @BeforeClass
    public void beforeClass(){
        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "/browser/chromedriver";

        System.setProperty("webdriver.chrome.driver", chromeDir);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void beforeMethod()  {
        driver.get("https://www.facebook.com/");
        sleepTest(2000);
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("Method is passing");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();

    }

    public static void sleepTest(long sleeptime){
        try{Thread.sleep(sleeptime);
        }catch (Exception e){

        }
    }
}
