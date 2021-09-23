package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisappearingElementsPageAsif extends BasePageInt{
    public DisappearingElementsPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']/div/ul//a[@href='/']")
    public WebElement home;
    public WebElement getHome() {
        return home;
    }

    @FindBy ( xpath = "//div[@id='content']/div/ul//a[@href='/about/']" )
    public WebElement about;
    public WebElement getAbout() {
        return about;
    }

    @FindBy ( xpath = "//div[@id='content']/div/ul//a[@href='/contact-us/']")
    public WebElement contactUs;
    public WebElement getContactUs() {
        return contactUs;
    }

    @FindBy ( xpath = "//div[@id='content']/div/ul//a[@href='/portfolio/']" )
    public WebElement portfolio;
    public WebElement getPortfolio() {
        return portfolio;
    }

    @FindBy ( xpath = "//div[@id='content']/div/ul//a[@href='/gallery/']" )
    public WebElement gallery;
    public WebElement getGallery() {
        return gallery;
    }
}
