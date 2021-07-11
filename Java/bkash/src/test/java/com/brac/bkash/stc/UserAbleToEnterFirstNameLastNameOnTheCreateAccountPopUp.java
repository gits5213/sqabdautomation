package com.brac.bkash.stc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToEnterFirstNameLastNameOnTheCreateAccountPopUp {



    public static void main(String[] args) throws InterruptedException {

        //Test case Name:UserAbleToEnterFirstNameLastNameOnTheCreateAccountPopUp
        //Selenium WebDriver


        //Pre-condition: Browser(Chrome)
        //String baseDir = System.getProperty("user.dir");

        String chromeDir = "C:\\Users\\User\\Documents\\GitHub\\sqabdautomation\\Java\\bkash\\browser\\chromedriver.exe";
        //System.out.println(chromeDir);

        System.setProperty("webdriver.chrome.driver", chromeDir);

        WebDriver driver = new ChromeDriver();

        //Navigate to the URL(https://www.google.com/)
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);
        //Click on Gmail link
        WebElement element = driver.findElement(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(1) > a"));
        element.click();
        Thread.sleep(1000);
        WebElement createAccount= driver.findElement(By.cssSelector("body > div.hercules-header.h-c-header.h-c-header--product-marketing-one-tier.header--desktop > div.h-c-header__bar > div.h-c-header__cta > ul.h-c-header__cta-list.header__nav--ltr > li.h-c-header__cta-li.h-c-header__cta-li--primary > a"));
        createAccount.click();
        Thread.sleep(1000);
        //Enter First Name-->Validate, able to type First Name
        //Enter Last Name-->Validate, able to type last name
        driver.quit();

    }



}
