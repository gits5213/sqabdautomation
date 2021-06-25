package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#content > div.example > h3")
    public WebElement fileUploadHeadingText;

    public WebElement getFileUploadHeadingText() {

        return fileUploadHeadingText;
    }

}
