package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.FormAuthenticationPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthenticationTcAsif extends BaseClass{

    @Test
    public void FormAuthenticationTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        FormAuthenticationPageAsif fapa = new FormAuthenticationPageAsif(driver);


        //TC-1. Click on FormAuthentication from INTERNETHEROKUAPP home page
        tilp.getFormAuthentication().click();
        sleepTest(2000);


        //TC-2. URL Validation
        String formAuthenticationUrl = driver.getCurrentUrl();
        Assert.assertEquals(formAuthenticationUrl, Data.BASE_URL+ Data.FORM_AUTHENTICATION_URL_CONCAT);
        System.out.println("Link equal");


        //TC-3. Sending Username
/*      fapa.userNameBox.sendKeys("/html//input[@id='username']");
        sleepTest(2000);
*/

        //TC-3. Sending Username
        WebElement userNameEmailBox = driver.findElement(By.xpath( "/html//input[@id='username']"));
        userNameEmailBox.sendKeys("admin123@yopmail.com");
        sleepTest(2000);

        //TC-4. Sending Password
        WebElement passwordInputBox = driver.findElement(By.xpath("/html//input[@id='password']"));
        passwordInputBox.sendKeys("admin123");
        sleepTest(2000);

        //TC-5. Login Button
        WebElement loginButton = driver.findElement(By.xpath("//form[@id='login']/button[@class='radius']"));
        loginButton.click();
        sleepTest(5000);

        //TC-6. Flash Alert
/*        WebElement flashAlert = driver.findElement(By.xpath("/html//div[@id='flash']"));
        String checkBoxText = flashAlert.getText();
        Assert.assertEquals(checkBoxText, Data.FLASH_ALERT_TEXT);
        sleepTest(2000);*/

        //TC-7. Clear the username box
        driver.navigate().back();
        sleepTest(3000);


        //TC-8. Clear the User Name box
        fapa.userNameBox.clear();
        sleepTest(5000);


        //TC-7. Navigate to Internet Herokuapp home page.
        driver.navigate().to(Data.BASE_URL);
        sleepTest(5000);
    }
}