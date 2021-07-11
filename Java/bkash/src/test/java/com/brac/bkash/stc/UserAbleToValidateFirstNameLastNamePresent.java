package com.brac.bkash.stc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToValidateFirstNameLastNamePresent {
    public static void main(String[] args) throws InterruptedException {


        String chromeDir ="C:\\Users\\User\\Documents\\GitHub\\sqabdautomation\\Java\\bkash\\browser\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDir);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
        //System.out.println(createNewAccount.isDisplayed());
        if(createNewAccount.isDisplayed()){
            System.out.println(createNewAccount.getText());
        }
        else{
            System.out.println("Create New Account is not displayed");
        }
        //Thread.sleep(2000);

        createNewAccount.click();
        Thread.sleep(2000);

        //WebElement firstName = driver.findElement(By.cssSelector("input#u_l_b_F1"));
        //firstName.sendKeys("Shakir");
        //Thread.sleep(2000);

        //driver.navigate();
        driver.quit();



    }


}
