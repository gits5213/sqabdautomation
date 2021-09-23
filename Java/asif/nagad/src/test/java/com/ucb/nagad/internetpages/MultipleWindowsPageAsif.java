package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPageAsif extends BasePageInt{
    public MultipleWindowsPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@id='content']//a[@href='/windows/new']")
    public WebElement clickHere;
    public WebElement getClickHere() {
        return clickHere;
    }

    @FindBy ( css = "h3" ) ////div[@id='content']//h3[.='Opening a new window']
    public WebElement windowText;
    public WebElement getWindowText() {
        return windowText;
    }

}
