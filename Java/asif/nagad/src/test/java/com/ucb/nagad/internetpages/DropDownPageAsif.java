package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPageAsif extends BasePageInt{
    public DropDownPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//select[@id='dropdown']" )
    public WebElement pleaseSelectAnOption;
    public WebElement getPleaseSelectAnOption() {
        return pleaseSelectAnOption;
    }

    @FindBy ( xpath = "//select[@id='dropdown']/option[@value='1']" )
    public WebElement optionOne;
    public WebElement getOptionOne() {
        return optionOne;
    }

    @FindBy ( xpath = "//select[@id='dropdown']/option[@value='2']" )
    public WebElement optionTwo;
    public WebElement getOptionTwo() {
        return optionTwo;
    }
}
