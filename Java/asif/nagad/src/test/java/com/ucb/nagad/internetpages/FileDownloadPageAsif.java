package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPageAsif extends BasePageInt{
    public FileDownloadPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( linkText = "SBSFacultyContactList.pdf" )
    public WebElement samplePdf;
    public WebElement getSamplePdf() {
        return samplePdf;
    }
}
