package com.saucedemo.swaglabs.testCases;
import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UserAbleToClickAndValidateAddRemoveElementsAndCorrespondingPages extends BaseClass {
    @Test
    public  void  userAbleToClickAndValidateAddRemoveElementsAndCorrespondingPages ()  {

        sleepTest(2000);

        //testCase 1. Click on create New account button

        WebElement addRemoveElements = driver.findElement(By.cssSelector("[href='\\/add_remove_elements\\/']"));
        sleepTest(2000);
        if (addRemoveElements.isDisplayed())
        {
            System.out.println(addRemoveElements.getText());
        }
        else {
            System.out.println(Data.negativeErrorMassage);
        }
        addRemoveElements.click();
        sleepTest(2000);
        WebElement addRemoveElementsHader = driver.findElement(By.cssSelector("div#content > h3"));
        sleepTest(2000);
        if (addRemoveElementsHader.isDisplayed())
        {
            System.out.println(addRemoveElementsHader.getText());
        }
        else {
            System.out.println(Data.negativeErrorMassage);
        }
        sleepTest(2000);
        WebElement addElement= driver.findElement(By.xpath("//div[@id='content']//button[.='Add Element']"));
        addElement.click();
        sleepTest(2000);
        addElement.click();
        WebElement delete1=driver.findElement(By.xpath("//div[@id='elements']/button[1]"));
        WebElement delete2=driver.findElement(By.xpath("//div[@id='elements']/button[2]"));
        sleepTest(5000);
        delete1.click();
        sleepTest(5000);
        delete2.click();
        sleepTest(5000);
        driver.navigate().back();
        sleepTest(5000);



    }
}
