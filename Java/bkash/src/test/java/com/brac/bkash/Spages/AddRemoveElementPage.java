package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementPage extends BasePage{
    public AddRemoveElementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > h3")
    public WebElement addRemoveElementHeaderText;

    public WebElement getAddRemoveElementHeaderText(){
        return addRemoveElementHeaderText;
    }

    @FindBy(css = "#content > div > button")
    public WebElement addElement;

    public WebElement getAddElement(){
        return addElement;
    }

    @FindBy(css = "#elements > button")
    public WebElement deleteElement;

    public WebElement getDeleteElement(){
        return deleteElement;
    }



}
