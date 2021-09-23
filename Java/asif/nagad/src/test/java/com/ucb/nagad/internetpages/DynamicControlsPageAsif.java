package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPageAsif extends BasePageInt{
    public DynamicControlsPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='checkbox']/input[@label='blah']" )
    public WebElement checkBox;
    public WebElement getCheckBox() {
        return checkBox;
    }

    @FindBy ( xpath = "//form[@id='checkbox-example']/button[@type='button']" )
    public WebElement removeAddButton;
    public WebElement getRemoveAddButton() {
        return removeAddButton;
    }

/*    @FindBy ( xpath = "" )
    public WebElement itsGone;
    public WebElement getItsGone() {
        return itsGone;
    }
*/

    @FindBy ( xpath = "//form[@id='input-example']/button[@type='button']" )
    public WebElement enableDisableButton;
    public WebElement getEnableDisableButton() {
        return enableDisableButton;
    }

    @FindBy ( xpath = "//form[@id='input-example']/input[@type='text']" )
    public WebElement textBoxEnableDisable;
    public WebElement getTextBoxEnableDisable() {
        return textBoxEnableDisable;
    }

}
