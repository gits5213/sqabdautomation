package com.brac.bkash.MahbubLiveProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPage extends BasePage{
    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h3[.='File Downloader']")
    public WebElement fileDownloadTest;

    public WebElement getFileDownloadTest() {
        return fileDownloadTest;}

    @FindBy(xpath = "")
    public WebElement fileDown;

    public WebElement getFileDown() {
        return fileDown;}




}
