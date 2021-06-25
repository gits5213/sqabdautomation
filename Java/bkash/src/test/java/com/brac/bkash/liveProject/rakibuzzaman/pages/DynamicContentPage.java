package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContentPage extends BasePage{
    public DynamicContentPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#content > div > h3")
    public WebElement dynamicContentHeadingText;

    public WebElement getDynamicContentHeadingText() {

        return dynamicContentHeadingText;
    }




}
