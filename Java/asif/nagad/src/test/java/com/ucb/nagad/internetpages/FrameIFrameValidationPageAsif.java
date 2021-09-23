package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrameIFrameValidationPageAsif extends BasePageInt{
    public FrameIFrameValidationPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']//ul//a[@href='/iframe']" )
    public WebElement iFrame;
    public WebElement getiFrame() {
        return iFrame;
    }

    @FindBy ( xpath = "//body[@id='tinymce']" )
    public WebElement textBox;
    public WebElement getTextBox() {
        return textBox;
    }

    @FindBy ( xpath = "iframe[@id='mce_0_ifr']" )
    public WebElement mainFrame;
    public WebElement getMainFrame() {
        return mainFrame;
    }
}