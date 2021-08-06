package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage extends BasePage{
    public ForgetPasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h2[.='Forgot Password']")
    public WebElement forgetPasswordPage;

    public WebElement getForgetPasswordPage() {
        return forgetPasswordPage;}

    @FindBy(css = "#email")
    public WebElement emailSelect;

    public WebElement getEmailSelect() {
        return emailSelect;}



}
