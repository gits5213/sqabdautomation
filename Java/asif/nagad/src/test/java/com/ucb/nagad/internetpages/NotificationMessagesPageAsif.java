package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagesPageAsif extends BasePageInt{
    public NotificationMessagesPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//div[@id='content']//a[@href='/notification_message']" )
    public WebElement clickHereLink;
    public WebElement getClickHereLink() {
        return clickHereLink;
    }

    @FindBy ( xpath = "/html//div[@id='flash']" )
    public WebElement flashAlertMessage;
    public WebElement getFlashAlertMessage() {
        return flashAlertMessage;
    }
}
