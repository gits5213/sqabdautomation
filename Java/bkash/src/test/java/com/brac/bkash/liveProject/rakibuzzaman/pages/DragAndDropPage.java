package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > div > h3")
    public WebElement dragAndDropHeadingText;

    public WebElement getDragAndDropHeadingText() {

        return dragAndDropHeadingText;
    }


}
