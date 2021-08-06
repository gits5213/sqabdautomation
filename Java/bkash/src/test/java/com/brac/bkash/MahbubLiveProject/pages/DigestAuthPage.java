package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigestAuthPage extends BasePage{
    public DigestAuthPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement SuccessText;

    public WebElement getSuccessText() {
        return SuccessText;
    }

}
