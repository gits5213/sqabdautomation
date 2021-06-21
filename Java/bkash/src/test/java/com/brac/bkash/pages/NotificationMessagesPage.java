package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagesPage extends BasePage{
    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#content > div > h3")
    public WebElement notificationMessagesHeadingText;

    public WebElement getNotificationMessagesHeadingText() {

        return  notificationMessagesHeadingText;
    }
}
