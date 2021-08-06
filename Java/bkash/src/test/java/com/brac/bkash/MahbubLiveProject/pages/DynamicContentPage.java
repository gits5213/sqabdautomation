package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContentPage extends BasePage{
    public DynamicContentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html//div[@id='content']//h3[.='Dynamic Content']")
    public WebElement dynamicContentHeadText;

    public WebElement getDynamicContentHeadText() {
        return dynamicContentHeadText;}
}
