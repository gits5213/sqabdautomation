package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbtestPage extends BasePage{
    public AbtestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".example h3")
    public WebElement abTestHeadingText;

    public WebElement getAbTestHeadingText() {
        return abTestHeadingText;
    }
}
