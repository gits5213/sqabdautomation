package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPage extends BasePage{
    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement redirectLinkHeadingText;

    public WebElement getRedirectLinkHeadingText() {
        return redirectLinkHeadingText;
    }

    @FindBy(css = "div#content a")
    public WebElement statusCodePage;

    public WebElement getStatusCodePage() {
        return statusCodePage;
    }

    @FindBy(css = "li:nth-of-type(1) > a")
    public WebElement validStatusPage;

    public WebElement getValidStatusPage() {
        return validStatusPage;
    }

    @FindBy(css = "li:nth-of-type(2) > a")
    public WebElement permanentStatusPage;

    public WebElement getPermanentStatusPage() {
        return permanentStatusPage;
    }

    @FindBy(css = "li:nth-of-type(3) > a")
    public WebElement notFoundStatusPage;

    public WebElement getNotFoundStatusPage() {
        return notFoundStatusPage;
    }

    @FindBy(css = "li:nth-of-type(4) > a")
    public WebElement serverErrorStatusPage;

    public WebElement getServerErrorStatusPage() {
        return serverErrorStatusPage;
    }

    @FindBy(css = "div#content a")
    public WebElement pageNaviBack;

    public WebElement getPageNaviBack() {
        return pageNaviBack;
    }





}
