package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > div > h3")
    public WebElement horizontalSliderHeadingText;

    public WebElement getHorizontalSliderHeadingText() {

        return horizontalSliderHeadingText;
    }


}
