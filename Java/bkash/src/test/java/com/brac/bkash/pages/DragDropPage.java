package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragDropPage extends BasePage{
    public DragDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h3[.='Drag and Drop']")
    public WebElement dragDropHeadText;

    public WebElement getDragDropHeadText() {
        return dragDropHeadText;}



}
