package com.bpo.nagad.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToEnterFirstNameLastNameOnTheCreateAccountPopUP {

    public static void main(String[] args) throws InterruptedException {

        //TestCase: UserAbleToEnterFirstNameLastNameOnTheCreateAccountPopUP
        //Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        //pre-Condition: Browser (Chrome)
        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "Browser/chromedriver_win32.zip";

        System.getProperty("webDriver.chrome.driver", chromeDir);



        //Navigate to the Url: https://www.google.com/
        //driver.get("");
        driver.navigate().to( "https://www.google.com/" );
        Thread.sleep(10000);

        //click on gmail link
        WebElement element = driver.findElement( By.cssSelector( "#b_results > li:nth-child(1) > h2 > a" ) );
        element.click();
        Thread.sleep(2000);
        //click on account link

        //Enter Firstname:
        //Enter Lastname:

        //Browser close:
        driver.quit();




    }
}
