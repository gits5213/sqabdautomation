package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkStatusPageAsif extends BasePageInt{
    public RedirectLinkStatusPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']//ul//a[@href='status_codes/200']" )
    public WebElement twoHundred;
    public WebElement getTwoHundred() {
        return twoHundred;
    }

    @FindBy ( xpath = "//div[@id='content']//ul//a[@href='status_codes/301']" )
    public WebElement threeHundredOne;
    public WebElement getThreeHundredOne() {
        return threeHundredOne;
    }

    @FindBy ( xpath = "//div[@id='content']//ul//a[@href='status_codes/404']" )
    public WebElement fourHundredFour;
    public WebElement getFourHundredFour() {
        return fourHundredFour;
    }

    @FindBy ( xpath = "//div[@id='content']//ul//a[@href='status_codes/500']" )
    public WebElement fiveHundred;
    public WebElement getFiveHundred() {
        return fiveHundred;
    }

    @FindBy ( xpath = "/html//div[@id='content']//a[@href='/status_codes']" )
    public WebElement statusCode;
    public WebElement getStatusCode() {
        return statusCode;
    }
}
