package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "select#dropdown")
    public WebElement dropDown;

    public WebElement getDropDown(){
        return dropDown;
    }


}


