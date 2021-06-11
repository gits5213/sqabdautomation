package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UserAbleToClickAndValidateABTestingAndCorrespondingPages extends BaseClass {

    @Test
    public  void  userAbleToClickAndValidateABTestingAndCorrespondingPages ()  {

        sleepTest(2000);

        //testCase 1. Click on create New account button

        WebElement abTesting = driver.findElement(By.cssSelector("[href='\\/abtest']"));
        sleepTest(2000);
        if (abTesting.isDisplayed())
        {
            System.out.println(abTesting.getText());
        }
        else {
            System.out.println(Data.negativeErrorMassage);
        }
        abTesting.click();
        sleepTest(2000);
        WebElement abTestingVariation1 = driver.findElement(By.xpath("//div[@id='content']//h3[.='A/B Test Variation 1']"));
        //Mouse Hover
        Actions action = new Actions(driver);
        action.moveToElement(abTestingVariation1).build().perform();
        //Mouse Hover

        sleepTest(2000);
        if (abTestingVariation1.isDisplayed())
        {
            System.out.println(abTestingVariation1.getText());
        }
        else {
            System.out.println(Data.negativeErrorMassage);
        }

        sleepTest(2000);
        driver.navigate().back();
        sleepTest(5000);

    }
}
