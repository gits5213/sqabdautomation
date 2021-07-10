package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkboxes [type='checkbox']:nth-of-type(1)")
    public WebElement checkBox1;

    public WebElement getCheckBox1() {
        return checkBox1; }

    @FindBy(css = "#checkboxes [type='checkbox']:nth-child(3)")
    public WebElement checkBox2;

    public WebElement getCheckBox2() {
        return checkBox2; }


    }
