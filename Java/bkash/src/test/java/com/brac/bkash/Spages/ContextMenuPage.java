package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage{
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > h3")
    public WebElement contextMenuHeaderText;

    public WebElement getContextMenuHeaderText(){
        return contextMenuHeaderText ;
    }

    @FindBy(css = "#hot-spot")
    public WebElement contextMenu;

    public WebElement getContextMenu(){
        return contextMenu;

    }
}
