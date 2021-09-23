package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.DynamicContentPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicContentTcAsif extends BaseClass{

    @Test
    public void dynamicContentTcAsif () {

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        DynamicContentPageAsif dcnpa = new DynamicContentPageAsif(driver);


        //TC-1. Click on DropDown
        tilp.getDynamicContent().click();
        sleepTest(3000);

        //TC-2. URL Validation
        String dynamicUrl = driver.getCurrentUrl();
        Assert.assertEquals(dynamicUrl, Data.BASE_URL + Data.DYNAMIC_CONTENT_URL_CONCAT);
        sleepTest(3000);

        //TC-3. Click here is clickable or not
        dcnpa.getClickHere().click();
        sleepTest(3000);

        //TC-4. ROW Count
        List <WebElement> numberOfRow = driver.findElements(By.className("row"));
        int rowCount = numberOfRow.size();
        System.out.println("Total rows in the table: " + rowCount);


/*        // //*[@id="content"]/div[1]/div[2]-> To identify the column for index output. Because the value will come with Row number & Column number.
        String beforeXpath = "//*[@id=\"content\"]/div[" ;
        String afterXpath = "]";*/

        // //*[@id="content"]/div[1]/div[2]-> To identify the column for index output. Because the value will come with Row number & Column number.
        String beforeXpath = "//div[@id='content']/div/div[@class='row']/div[@id='content']/div[" ;
        String afterXpath = "]";
        System.out.println("GOT THE PARAGRAPH");



        //TC-5. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(3000);
    }

}
