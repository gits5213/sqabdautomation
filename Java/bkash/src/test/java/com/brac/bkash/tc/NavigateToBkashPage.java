package com.brac.bkash.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateToBkashPage {
    public static void main(String[] args) throws InterruptedException {

        //Test case Name: UserAbleToEnterFirstNameLastNameOnTheCreateAccountPopUP
        //Selenium WebDriver

        //Pre-condition: Browser (Chrome)
        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDir);

        WebDriver driver = new ChromeDriver();
        //Navigate to the URL (https://www.google.com/)
        //driver.get("");
        driver.navigate().to("https://www.bkash.com/");
        Thread.sleep(2000);

        driver.quit();
        Thread.sleep(2000);
    }
}
