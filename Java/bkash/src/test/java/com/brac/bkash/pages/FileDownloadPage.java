package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPage extends BasePage{
    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="#content > div > h3")
    public WebElement fileDownloadHeadingText;

    public WebElement getFileDownloadHeadingText() {

        return fileDownloadHeadingText;
    }

}
