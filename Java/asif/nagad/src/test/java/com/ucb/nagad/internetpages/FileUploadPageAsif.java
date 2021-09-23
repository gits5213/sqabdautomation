package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPageAsif extends BasePageInt{
    public FileUploadPageAsif(WebDriver driver) {
        super(driver);
    }

/*    @FindBy ( xpath = "//input[#'file-upload']" )
    public WebElement chooseFileButton;
    public WebElement getChooseFileButton() {
        return chooseFileButton;
}
*/

    //
    @FindBy ( id = "file-upload" )
    public WebElement chooseFileButton;
    public WebElement getChooseFileButton() {
        return chooseFileButton;
    }

    @FindBy ( xpath = "//input[@id='file-submit']" )
    public WebElement uploadButton;
    public WebElement getUploadButton() {
        return uploadButton;
    }

    @FindBy ( xpath = "//div[@id='drag-drop-upload']" )
    public WebElement dragDropUploadBox;
    public WebElement getDragDropUploadBox() {
        return dragDropUploadBox;
    }


}
