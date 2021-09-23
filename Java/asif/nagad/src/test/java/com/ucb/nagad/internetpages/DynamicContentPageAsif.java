package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContentPageAsif extends BasePageInt{
    public DynamicContentPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html//div[@id='content']//a[@href='/dynamic_content?with_content=static']" )
    public WebElement clickHere;
    public WebElement getClickHere() {
        return clickHere;
    }
}
