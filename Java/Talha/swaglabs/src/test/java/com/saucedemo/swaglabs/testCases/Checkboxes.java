package com.saucedemo.swaglabs.testCases;

import com.saucedemo.swaglabs.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkboxes extends BaseClass {

    @Test
    public void checkboxes (){
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='content']/ul//a[@href='/checkboxes']"));
        sleepTest(1000);
        checkbox.click();
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        if(checkbox2.isSelected())
        {
            System.out.println(Data.POSITIVE_MASSAGE+" Checkbox Selected");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        sleepTest( 1000);
        checkbox1.click();
        sleepTest(1000);
        checkbox2.click();
        sleepTest(1000);
        checkbox1.click();
        sleepTest(1000);
        driver.navigate().back();
        sleepTest(1000);
    }
}
