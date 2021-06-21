package com.brac.bkash.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToCreateNewButtonOnFaceBook {
    public static void main(String[] args) throws InterruptedException {
        //pre-condition:   Browser (Chrome)
        String baseDir = System.getProperty("user.dir");
        //System.out.println(baseDir);
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDir);

        WebDriver driver = new ChromeDriver();


        //Navigate to the URL (https://www.facebook.com/)
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        //driver.navigate().to("https://www.facebook.com/");

        //Validate CreateNewAccount present
        //Validate Create New Account test
        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));

        //soft assertion
        if (createNewAccount.isDisplayed()){
            System.out.println(createNewAccount.getText());

        }else {
            System.out.println("Create New Account is not displayed");
        }

        //createNewAccount.getText()
        //createNewAccount.isDisplayed();
        Thread.sleep(5000);
        //Click on CreateNewAccount

        //Validate First Name is present & Enable / Enter First Name
        //Validate Last Name is present & Enable / Enter Last Name

        //Browser close
        driver.quit();
        Thread.sleep(2000);



    }
}
