package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPage extends BasePage {
    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > h3")
    public WebElement redirectLinkHeadingText;

    public WebElement getRedirectLinkHeadingText() {

        return redirectLinkHeadingText;
    }

}