package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormAuthPage extends BasePage{
    public FormAuthPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath ="//div[@id='content']//h2[.='Login Page']")
    public WebElement formAuthTest;

    public WebElement getFormAuthTest() {
        return formAuthTest;
    }

    @FindBy(xpath ="/html//input[@id='username']")
    public WebElement formAuthUser;

    public WebElement getFormAuthUser() {
        return formAuthUser;
    }

    @FindBy(xpath ="/html//input[@id='password']")
    public WebElement formAuthPassword;

    public WebElement getFormAuthPassword() {
        return formAuthPassword;
    }

    @FindBy(xpath ="//form[@id='login']//i[@class='fa fa-2x fa-sign-in']")
    public WebElement formAuthButton;

    public WebElement getFormAuthButton() {
        return formAuthButton;
    }

    @FindBy(xpath ="//div[@id='content']//h2")
    public WebElement formAuthConfirmText;

    public WebElement getFormAuthConfirmText() {
        return formAuthConfirmText;
    }


    @FindBy(xpath ="//div[@id='content']//a[@href='/logout']/i[@class='icon-2x icon-signout']")
    public WebElement formAuthSignOut;

    public WebElement getFormAuthSignOut() {
        return formAuthSignOut;
    }




}
