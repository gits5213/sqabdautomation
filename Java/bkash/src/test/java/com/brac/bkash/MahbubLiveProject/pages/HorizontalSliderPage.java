package com.brac.bkash.MahbubLiveProject.pages;

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

    @FindBy(xpath = "/html//div[@id='content']//input[@value='0']")
    public WebElement horizontalSlider;

    public WebElement getHorizontalSlider() {
        return horizontalSlider;
    }

    @FindBy(xpath = "/html//span[@id='range']")
    public WebElement horizontalRange;

    public WebElement getHorizontalRange() {
        return horizontalRange;





}
}
