package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage{
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#content > div > h3")
    public WebElement javaScriptAlertsHeadingText;

    public WebElement getJavaScriptAlertsHeadingText() {

        return  javaScriptAlertsHeadingText;
    }
}
