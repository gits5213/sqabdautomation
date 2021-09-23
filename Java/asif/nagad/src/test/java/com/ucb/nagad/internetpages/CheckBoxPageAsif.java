package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPageAsif extends BasePageInt{
    public CheckBoxPageAsif(WebDriver driver) {
        super(driver);
    }

    //Checkboxes
    @FindBy ( xpath = "//div[@id='content']//h3[.='Checkboxes']" )
    public WebElement checkBoxPara;
    public WebElement getCheckBoxPara(){
        return checkBoxPara;
    }

    //checkbox1
    @FindBy ( xpath = "//form[@id='checkboxes']/input[1]" )
    public WebElement checkBox1;
    public WebElement getCheckBox1(){
        return checkBox1;
    }

    //checkbox2
    @FindBy ( xpath = "//form[@id='checkboxes']/input[2]" )
    public WebElement checkBox2;
    public WebElement getCheckBox2(){
        return checkBox2;
    }

}
