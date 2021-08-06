package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptTestPage extends BasePage{
    public JavaScriptTestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    public WebElement javaScriptHeadingText;

    public WebElement getJavaScriptHeadingText() {
        return javaScriptHeadingText;
    }
    @FindBy(css = "[onclick='jsAlert\\(\\)']")
    public WebElement jsAlertText;

    public WebElement getJsAlertText() {
        return jsAlertText;
    }

    @FindBy(css = "[onclick='jsConfirm\\(\\)']")
    public WebElement jsConfirmText;

    public WebElement getJsConfirmText() {
        return jsConfirmText;
    }

    @FindBy(css = "[onclick='jsPrompt\\(\\)']")
    public WebElement jsPromptText;

    public WebElement getJsPromptText() {
        return jsPromptText;
    }

    @FindBy(css = "#result")
    public WebElement resultText;

    public WebElement getResultText() {
        return resultText;
    }


}
