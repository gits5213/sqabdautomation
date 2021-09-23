package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPageAsif extends BasePageInt{
    public DragAndDropPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//div[@id='column-a']" )
    public WebElement dragAndDropA;
    public WebElement getDragAndDropA() {
        return dragAndDropA;
    }

    @FindBy ( xpath = "/html//div[@id='column-b']" )
    public WebElement dragAndDropB;
    public WebElement getDragAndDropB() {
        return dragAndDropB;
    }
}
