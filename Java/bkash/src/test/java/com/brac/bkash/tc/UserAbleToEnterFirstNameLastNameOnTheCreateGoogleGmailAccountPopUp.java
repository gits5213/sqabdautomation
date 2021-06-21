package com.brac.bkash.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToEnterFirstNameLastNameOnTheCreateGoogleGmailAccountPopUp {
    public static void main(String[] args) throws InterruptedException {

        //Test case Name: UserAbleToEnterFirstNameLastNameOnTheCreateGoogleGmailAccountPopUp
        //Selenium WebDriver
        //WebDriver driver = new ChromeDriver();

        //pre-condition:   Browser (Chrome)
        String baseDir = System.getProperty("user.dir");
        //System.out.println(baseDir);
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDir);

        WebDriver driver = new ChromeDriver();


        //Navigate to the URL (https://www.google.com/)
        //driver.get("");
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);

        //Click on Gmail Link
        WebElement element = driver.findElement(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(1) > a"));
        element.click();
        Thread.sleep(5000);
        //Click on Create Account link
        WebElement createAccount = driver.findElement(By.cssSelector("body"));
        createAccount.click();
        Thread.sleep(5000);
        //Enter First Name--> validate, able to type First Name

        //Browser close
        driver.quit();
        Thread.sleep(2000);


    }
}
