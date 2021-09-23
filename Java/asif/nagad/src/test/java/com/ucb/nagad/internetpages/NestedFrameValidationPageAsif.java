package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFrameValidationPageAsif extends BasePageInt{
    public NestedFrameValidationPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']//ul//a[@href='/nested_frames']" )
    public WebElement nestedFrames;
    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    @FindBy (xpath = "/html/body")
    public WebElement topLeftMiddleRightBottom;
    public WebElement getTopLeftMiddleRightBottom() {
        return topLeftMiddleRightBottom;
    }

    @FindBy ( xpath = "//div[@id='content']//ul//a[@href='/iframe']" )
    public WebElement iFrame;
    public WebElement getiFrame() {
        return iFrame;
    }
}