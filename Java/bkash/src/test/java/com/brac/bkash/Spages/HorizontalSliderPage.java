package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage{
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > div > input[type=range]")
    public WebElement horizontalSlider;

    public WebElement getHorizontalSlider(){
        return horizontalSlider;
    }

    @FindBy(css = "span#range")
    public WebElement sliderValue;

    public WebElement getSliderValue(){
        return sliderValue;
    }


}
