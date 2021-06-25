package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage{
    public DropdownPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="#content > div > h3")
    public WebElement dropdownHeadingText;

    public WebElement getDropdownHeadingText() {

        return dropdownHeadingText;
    }


}
