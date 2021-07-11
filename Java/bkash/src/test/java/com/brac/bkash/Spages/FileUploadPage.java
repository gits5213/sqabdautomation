package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#file-upload")
    public WebElement fileUpload;

    public WebElement getFileUpload(){
        return fileUpload;

    }


}
