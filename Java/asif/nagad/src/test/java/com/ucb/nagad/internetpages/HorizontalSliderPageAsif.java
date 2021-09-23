package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPageAsif extends BasePageInt{
    public HorizontalSliderPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//div[@id='content']//input[@value='0']")
    public WebElement slider;
    public WebElement getSlider() {
        return slider;
    }
}
