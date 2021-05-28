package com.brac.bkash.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToValidateCreateNewAccount {

    public static void main(String[] args) throws InterruptedException {

        //Pre-condition: Browser Install + Browser Configuration + Browser (Chrome)
        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "/browser/chromedriver";

        System.setProperty("webdriver.chrome.driver", chromeDir);

        WebDriver driver = new ChromeDriver();

        //Open Browser
        //Navigate to the URL (https://www.google.com/)
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        //driver.navigate().to("https://www.facebook.com/");


        //Validate CreateNewAccount present
        //Validate "Create New Account" text
        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));

        //Soft assertion
        //createNewAccount.getText();
        //createNewAccount.isDisplayed();
        if(createNewAccount.isDisplayed()){
            System.out.println(createNewAccount.getText());
        }else {
            System.out.println("Create New Account is not displayed!");
        }
        Thread.sleep(2000);


        //Browser close
        driver.quit();
    }



}
