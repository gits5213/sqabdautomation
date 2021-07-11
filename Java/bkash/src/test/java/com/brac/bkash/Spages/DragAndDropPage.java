package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "#column-a")
    public WebElement aDragDrop;

    public WebElement getADragDrop(){
        return aDragDrop;

    }

    @FindBy(css = "#column-b")
    public WebElement bDragDrop;

    public WebElement getBDragDrop(){
        return bDragDrop;

    }


}
