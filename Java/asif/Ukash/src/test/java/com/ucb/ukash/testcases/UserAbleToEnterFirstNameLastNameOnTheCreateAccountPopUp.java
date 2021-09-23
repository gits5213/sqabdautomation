package com.ucb.ukash.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserAbleToEnterFirstNameLastNameOnTheCreateAccountPopUp {

    @Test
    public void userAbleToEnterFirstNameLastNameOnTheCreateAccountPopUp() throws InterruptedException {
        //Test Case Name: UserAbleToEnterFirstNameLastNameOnTheCreateAccountPopUp
        //Selenium Webdriver
        //WebDriver driver = new ChromeDriver();

        //Pre-condition: Browser(Chrome)
        String baseDir = System.getProperty("user.dir");
        System.out.println(baseDir);
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.out.println(chromeDir);
        System.setProperty("webdriver.chrome.driver", chromeDir);


        //String chromeDir = baseDir + "browser\chromedriver.exe";
        //System.out.println(chromeDir);
        //String chromeDir = "C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\Ukash\\browser\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", chromeDir);

        WebDriver driver = new ChromeDriver();


        //Navigate to the URL (https://www.google.com/)
        //driver.get("");
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(5000);

        //Click on the Gmail link
        WebElement element = driver.findElement(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(1) > a"));
        element.click();
        Thread.sleep(2000);

        //Click on Create an account link
        WebElement createAccount = driver.findElement(By.cssSelector("body > div.hercules-header.h-c-header.h-c-header--product-marketing-one-tier.header--desktop > div.h-c-header__bar > div.h-c-header__cta > ul.h-c-header__cta-list.header__nav--ltr > li.h-c-header__cta-li.h-c-header__cta-li--primary > a"));
        createAccount.click();
        Thread.sleep(3000);

        //Enter First Name --> Validate, Able to type First Name
/*        WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
        firstName.sendKeys("AsifIqbal");
        Thread.sleep(3000);*/

        //Enter Last Name --> Validate, Able to type Last Name
        driver.quit();


    }

}
