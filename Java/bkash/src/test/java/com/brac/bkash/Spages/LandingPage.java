package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) a")
    public WebElement abTestingLink;

    public WebElement getAbTestingLink() {
        return abTestingLink;
    }


    //Add/Remove Elements
    @FindBy(css = "#content > ul > li:nth-child(2) > a")
    public WebElement addRemoveElemetLink;

    public WebElement getAddRemoveElemetLink() {
        return addRemoveElemetLink;
    }

    //BasicAuth
    @FindBy(css = "li:nth-of-type(3) > a")
    public WebElement basicAuthLink;

    public WebElement getBasicAuthLink() {
        return basicAuthLink;
    }

    //CheckBox
    @FindBy(css = "#content > ul > li:nth-child(6) > a")
    public WebElement checkBoxLink;

    public WebElement getCheckBoxLink() {
        return checkBoxLink;
    }


    //Context Menu
    @FindBy(css = "#content > ul > li:nth-child(7) > a")
    public WebElement contextMenuLink;

    public WebElement getContextMenuLink() {
        return contextMenuLink;
    }

    //Mouse Hovers
    @FindBy(css = "#content > ul > li:nth-child(25) > a")
    public WebElement hoversLink;

    public WebElement getHoversLink() {
        return hoversLink;
    }


    @FindBy(css = "#content > ul > li:nth-child(10) > a")
    public WebElement dragAndDrop;

    public WebElement getDragAndDrop() {
        return dragAndDrop;

    }


    @FindBy(css = "li:nth-of-type(11) > a")
    public WebElement dropDownLink;

    public WebElement getDropDownLink() {
        return dropDownLink;

    }

    //Dynamic Content
    @FindBy(css = "li:nth-of-type(12) > a")
    public WebElement dynamicContentLink;

    public WebElement getDynamicContentLink() {
        return dynamicContentLink;

    }

    //File Download
    @FindBy(css = "li:nth-of-type(17) > a")
    public WebElement fileDownloadLink;

    public WebElement getFileDownloadLink() {
        return fileDownloadLink;

    }

    //File Upload
    @FindBy(css = "li:nth-of-type(18) > a")
    public WebElement fileUploadLink;

    public WebElement getFileUploadLink() {
        return fileUploadLink;

    }

    //Forgot Password
    @FindBy(css = "li:nth-of-type(20) > a")
    public WebElement forgotPasswordLink;

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;

    }

    //Form Authentication
    @FindBy(css = "li:nth-of-type(21) > a")
    public WebElement formAuthenticationLink;

    public WebElement getFormAuthenticationLink() {
        return formAuthenticationLink;
    }
    //Horizontal Slider
    @FindBy(css = "#content > ul > li:nth-child(24) > a")
    public WebElement horizontalSliderLink;

    public WebElement getHorizontalSliderLink() {
        return horizontalSliderLink;
    }

    //Infinite Scroll
    @FindBy(css = "#content > ul > li:nth-child(26) > a")
    public WebElement infiniteScrollLink;

    public WebElement getInfiniteScrollLink() {
        return infiniteScrollLink;
    }

    //Multiple Window
    @FindBy(css = "#content > ul > li:nth-child(33) > a")
    public WebElement multipleWindowLink;

    public WebElement getMultipleWindowLink() {
        return multipleWindowLink;
    }


}