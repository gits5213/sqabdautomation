package com.saucedemo.swaglabs.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UserAbleToClickOnLoginSwagLabs {
    @Test
    public void userAbleToClickOnLoginSwagLabs() throws InterruptedException {


        // PreConditions : Chrome Browser install+Configaration+Open browser
        String baseDir = System.getProperty("user.dir");
        String chromeDir= baseDir + "/browser/chromedriver.exe ";
        // System.out.println(chromeDir);
        System.setProperty("webdriver.chrome.driver", chromeDir);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(2000);

        //testCase 1. Click on create New account button

        WebElement username = driver.findElement(By.cssSelector("#user-name"));
        username.sendKeys("standard_user");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("secret_sauce");
        Thread.sleep(3000);
        WebElement login = driver.findElement(By.xpath("/html//input[@id='login-button']"));

                   // Mouse  Hover
        //Actions action = new Actions(driver);
       // action.moveToElement(login).perform();
        //action.click().build().perform();
        Thread.sleep(3000);
        login.click();
        Thread.sleep(3000);

        driver.quit();



    }
}
