package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPageAsif extends BasePageInt{
    public JavaScriptAlertsPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']//ul//button[.='Click for JS Alert']" )
    public WebElement clickForJsAlert;
    public WebElement getClickForJsAlert() {
        return clickForJsAlert;
    }

    @FindBy ( xpath = "/html//p[@id='result']" )
    public  WebElement resultText;
    public WebElement getResultText() {
        return resultText;
    }

    @FindBy ( xpath = "//div[@id='content']//ul//button[.='Click for JS Confirm']" )
    public WebElement clickForJsConfirm;
    public WebElement getClickForJsConfirm() {
        return clickForJsConfirm;
    }

    @FindBy ( xpath = "//div[@id='content']//ul//button[.='Click for JS Prompt']" )
    public WebElement clickForJsPrompt;
    public WebElement getClickForJsPrompt() {
        return clickForJsPrompt;
    }
}