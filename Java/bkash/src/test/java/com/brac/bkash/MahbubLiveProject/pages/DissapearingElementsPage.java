package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DissapearingElementsPage extends BasePage{
    public DissapearingElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement disappearElementHeadingText;

    public WebElement getDisappearElementHeadingText() {
        return disappearElementHeadingText;
    }

    @FindBy(css = "p")
    public WebElement disappearElementParaText;

    public WebElement getDisappearElementParaText() {
        return disappearElementParaText;
    }

    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/']")
    public WebElement homeMenu;

    public WebElement getHomeMenu() {
        return homeMenu;
    }

    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/about/']")
    public WebElement aboutMenu;

    public WebElement getAboutMenu() {
        return aboutMenu;
    }

    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/contact-us/']")
    public WebElement contactUsMenu;

    public WebElement getContactUsMenu() {
        return contactUsMenu;
    }

    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/portfolio/']")
    public WebElement portfolioMenu;

    public WebElement getPortfolioMenu() {
        return portfolioMenu;
    }

    @FindBy(xpath = "//div[@id='content']/div/ul//a[@href='/gallery/']")
    public WebElement galleryMenu;

    public WebElement getGalleryMenu() {
        return galleryMenu;
    }


}
