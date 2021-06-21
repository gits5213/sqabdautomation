package com.brac.bkash.liveProject.testCases;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes extends BaseTest {


    @Test
    public void checkboxes(){

        //Navigate to the URL
        //Click on Checkboxes
        LandingPage lp = new LandingPage(driver);
        lp.getCheckboxesLink().click();
        sleepTest(1000);

        //Validate Checkboxes URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,"http://the-internet.herokuapp.com/checkboxes");
        sleepTest(2000);
        //Click on checkbox 1
        //Verify checkbox is selected or not

        driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();
        sleepTest(2000);
        driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
        sleepTest(2000);

        //Back
        driver.navigate().back();
        sleepTest(2000);

    }
}
