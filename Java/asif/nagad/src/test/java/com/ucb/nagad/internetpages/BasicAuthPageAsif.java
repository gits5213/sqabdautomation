package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPageAsif extends BasePageInt{

    public BasicAuthPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@id='content']//h3[.='Basic Auth']")
    public WebElement basicAuthHeader;
    public WebElement getBasicAuthHeader() {
        return basicAuthHeader;
    }

    @FindBy ( xpath = "//div[@id='content']//p" )
    public WebElement basicAuthPara;
    public WebElement getBasicAuthPara(){
        return basicAuthPara;
    }
}
