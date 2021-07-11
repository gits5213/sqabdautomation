package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage{
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(1)")
    public WebElement checkBox1;

    public WebElement getCheckBox1(){
        return checkBox1;
    }



    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(3)")
    public WebElement checkBox2;

    public WebElement getCheckBox2(){
        return checkBox2;
    }

}
