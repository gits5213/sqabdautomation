package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) a")
    public WebElement abTestingLink;

    @FindBy(css = "")
    public WebElement adRemoveElementLink;

    @FindBy(css = "")
    public WebElement basicAuth;



    public WebElement getAbTestingLink() {
        return abTestingLink;
    }
    public WebElement getAdRemoveElementLink() {
        return adRemoveElementLink;
    }
    public WebElement getBasicAuth() {
        return basicAuth;
    }
}
