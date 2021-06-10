package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@id='content']//h3[.='Dropdown List']")
    public WebElement dropDownHeadTest;

    public WebElement getDropDownHeadTest() {
        return dropDownHeadTest;}

}
