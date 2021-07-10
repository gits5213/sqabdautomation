package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.DynamicContentPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicContentTest extends BaseTest{

    @Test
    public void dynamicContentTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getDynamicContentTest().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DYNAMIC_CONTENT );
        sleepTest(2000);

        DynamicContentPage dynamicpage = new DynamicContentPage(driver);
        String headerText = dynamicpage.getDynamicContentHeadText().getText();
        Assert.assertEquals(headerText, Data.DYNAMIC_CONTENT_HEADER);
        sleepTest(2000);

        //  //*[@id="content"]/div[1]
        //  //*[@id="content"]/div[2]
        //  //*[@id="content"]/div[3]
        List <WebElement> rows = driver.findElements(By.className("row"));
        int rowCount = rows.size();
        System.out.println("Total rows in the table: " + rowCount);

        String beforeXpath = "//*[@id=\"content\"]/div[";
        String afterXpath = "]";




        driver.navigate().back();
        sleepTest(1000);
    }
}
