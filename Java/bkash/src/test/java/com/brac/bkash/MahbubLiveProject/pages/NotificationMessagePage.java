package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagePage extends BasePage{
    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "h3")
    public WebElement notificationMessageHeaderText;

    public WebElement getNotificationMessageHeaderText() {
        return notificationMessageHeaderText;
    }

    @FindBy(css = "[href='\\/notification_message']")
    public WebElement notificationMessagePageButton;

    public WebElement getNotificationMessagePageButton () {
        return notificationMessagePageButton;
    }

    @FindBy(css = "#flash")
    public WebElement notificationMessageStatusChange;
    public WebElement getNotificationMessageStatusChange () { return notificationMessageStatusChange;}


}
