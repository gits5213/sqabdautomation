package com.ucb.nagad.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateCreateNewAccount extends BaseClass {
    @Test
    public void userAbleToValidateCreateNewAccount (){

/*        //Pre-condition: Browser Install + Browser Configuration + (Chrome)
        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDir);

        WebDriver driver = new ChromeDriver();

        //Navigate to the URL (https://www.facebook.com/);
        //driver.navigate().to("https://www.facebook.com/");
        driver.get("https://www.facebook.com/");
        sleepTest(2000);*/

        //Validate CreateNewAccount present
        //Validate Create New Account text
        WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));

        //Soft assertion
        if (createNewAccount.isDisplayed()){
            System.out.println(createNewAccount.getText());
        }
        else{
            System.out.println("Create New Account is not displayed");
        }


        System.out.println(createNewAccount.isDisplayed());
        System.out.println(createNewAccount.getText());
        //createNewAccount.getText();
        //createNewAccount.isDisplayed();
        sleepTest(2000);

        //Click on CreateNewAccount
        /*WebElement createNewAccountclick = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
        createNewAccountclick.click();
        Thread.sleep(2000);*/

        WebElement forgetPass = driver.findElement(By.cssSelector("._6ltj > a"));
        forgetPass.click();
        sleepTest(2000);

        WebElement phoneNumber = driver.findElement(By.cssSelector("input#identify_email"));

        if (phoneNumber.isEnabled()){
            phoneNumber.sendKeys("+8801717656345");
        }
        else{
            System.out.println("Phone number input field is disabled");
        }

        sleepTest(2000);

        WebElement searchNumber = driver.findElement(By.xpath("//*[@id=\"did_submit\"]"));
        searchNumber.click();
        sleepTest(2000);

        //Browser Close
        driver.quit();

    }
}
