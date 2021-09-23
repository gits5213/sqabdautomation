package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigestAuthenticationPageAsif extends BasePageInt{
    public DigestAuthenticationPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']//h3[.='Digest Auth']")
    public WebElement digestAuthHeader;
    public WebElement getDigestAuthHeader() {
        return digestAuthHeader;
    }

    @FindBy ( xpath = "//div[@id='content']//p" )
    public WebElement digestAuthPara;
    public WebElement getDigestAuthPara() {
        return digestAuthPara;
    }
}
