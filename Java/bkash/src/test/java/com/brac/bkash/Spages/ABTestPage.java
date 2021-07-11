package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestPage extends BasePage{

    public ABTestPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = ".example h3")
    public WebElement abTestHeaderText;

    @FindBy(css = "#content > div > p")
    public WebElement paragraphText;

    public WebElement getAbTestHeaderText()
    {
        return abTestHeaderText;
    }

    public WebElement getParagraphText()
    {
        return paragraphText;
    }
}
