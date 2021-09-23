package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsValidationPageAsif extends BasePageInt{
    public InputsValidationPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//div[@id='content']//input[@type='number']" )
    public WebElement inputField;
    public WebElement getInputField() {
        return inputField;
    }

}
