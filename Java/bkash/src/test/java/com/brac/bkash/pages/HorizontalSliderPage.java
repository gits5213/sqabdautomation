package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement horizontalSliderPageText;

    public WebElement getHorizontalSliderPageText() {
        return horizontalSliderPageText;
    }
}
