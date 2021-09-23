package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPageAsif extends BasePageInt{
    public RedirectLinkPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//a[@id='redirect']" )
    public WebElement clickHereLink;
    public WebElement getClickHereLink() {
        return clickHereLink;
    }


}
