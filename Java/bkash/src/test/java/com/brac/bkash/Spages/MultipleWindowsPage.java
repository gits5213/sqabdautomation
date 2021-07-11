package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > a")
    public WebElement multipleWindows;

    public WebElement getMultipleWindows(){
        return multipleWindows;
    }

    @FindBy(css = "body > div > h3")
    public WebElement newWindow;

    public WebElement getNewWindow(){
        return newWindow;
    }

}
