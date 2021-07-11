package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPage extends BasePage{
    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#content > div > a:nth-of-type(1)")
    public WebElement fileDownload;

    public WebElement getFileDownload(){
        return fileDownload;
    }



}
