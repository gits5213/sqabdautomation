package com.saucedemo.swaglabs.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicAuth extends BaseClass{

    @Test
    public  void  basicAuth (){

        WebElement basicAuth =driver.findElement(By.cssSelector("[href='\\/basic_auth'][href='\\/basic_auth']"));
        basicAuth.click();
        sleepTest(5000);

        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.name("Sign in")).submit();

        sleepTest(5000);





        sleepTest(5000);

    }


}
