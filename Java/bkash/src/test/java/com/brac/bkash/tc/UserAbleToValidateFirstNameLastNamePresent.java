package com.brac.bkash.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToValidateFirstNameLastNamePresent {


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

        WebElement forgetPass = driver.findElement(By.cssSelector("._6ltj > a"));
        forgetPass.click();
        Thread.sleep(   1000);
        WebElement phoneNumber = driver.findElement(By.cssSelector("#identify_email"));
        //Soft assertion
        if(phoneNumber.isEnabled()){
            phoneNumber.sendKeys("917-561-6554");
        }else {
            System.out.println("Phone number input field is disable!");
        }

        Thread.sleep(2000);

        //Browser close
        driver.quit();
    }

}
