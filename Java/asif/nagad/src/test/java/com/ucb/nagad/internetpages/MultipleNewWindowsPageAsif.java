package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleNewWindowsPageAsif extends BasePageInt{
    public MultipleNewWindowsPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( css = "h3" ) //div[@class='example']/h3[.='New Window']
    public WebElement newWindowText;
    public WebElement getNewWindowText() {
        return newWindowText;
    }

}
