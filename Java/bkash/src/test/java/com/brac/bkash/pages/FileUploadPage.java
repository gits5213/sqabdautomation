package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h3[.='File Uploader']")
    public WebElement fileUploadTest;

    public WebElement getFileUploadTest() {
        return fileUploadTest;}

}
