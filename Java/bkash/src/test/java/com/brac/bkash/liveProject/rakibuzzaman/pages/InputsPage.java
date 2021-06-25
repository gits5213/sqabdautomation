package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPage extends BasePage{
    public InputsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > div > div > h3")
    public WebElement inputsHeadingText;

    public WebElement getInputsHeadingText() {

        return  inputsHeadingText;
    }
}
