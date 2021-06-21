package com.brac.bkash.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleCreateNewAccountOnFaceBook {
    public static void main(String[] args) throws InterruptedException {
        //pre-condition:   Browser (Chrome)
        String baseDir = System.getProperty("user.dir");
        //System.out.println(baseDir);
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDir);

        WebDriver driver = new ChromeDriver();

        //Navigate to the URL (https://www.facebook.com/)
        //driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.facebook.com/");

        //createNewAccount.getText()
        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
        createNewAccount.click();
        Thread.sleep(5000);
        //createNewAccount.getText()
        //createNewAccount.isDisplayed()
       //Browser close
        driver.quit();
        Thread.sleep(2000);
    }
}
