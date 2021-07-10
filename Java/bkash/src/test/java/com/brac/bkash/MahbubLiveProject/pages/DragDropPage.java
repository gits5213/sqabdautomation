package com.brac.bkash.MahbubLiveProject.pages;

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

    @FindBy(xpath = "/html//div[@id='column-a']")
    public WebElement dragDropSrc;

    public WebElement getDragDropSrc() {
        return dragDropSrc;}

    @FindBy(xpath = "/html//div[@id='column-b']")
    public WebElement dragDropDest;

    public WebElement getDragDropDest() {
        return dragDropDest;}



}
