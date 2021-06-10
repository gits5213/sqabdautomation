package com.brac.bkash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    //AB TESTING
    @FindBy(css = "li:nth-of-type(1) a")
    public WebElement abTestingLink;
    public WebElement getAbTestingLink() {
        return abTestingLink;
    }

    //ADD REMOVE ELEMENT
    @FindBy(css = "#content > ul:nth-child(4) > li:nth-child(2) > a:nth-child(1)")
    public WebElement addRemoveElementLink;
    public WebElement getAdRemoveElementLink() { return addRemoveElementLink;}

    //ADD BUTTON
    //@FindBy(xpath = "//div[@id='content']//button[.='Add Element']")
   // public WebElement addButtonLink;
    //public WebElement getAddButtonLink() {
       // return addButtonLink;
    //}

    //BASIC AUTH
    @FindBy(css = "#content > ul:nth-child(4) > li:nth-child(3) > a:nth-child(1)")
    public WebElement basicAuth;
    public WebElement getBasicAuth() {return basicAuth;}


    //Broken Images Page
    @FindBy(css = "li:nth-of-type(4) > a")
    public WebElement brokenImages;
    public WebElement getBrokenImages() {
        return brokenImages;}

    //CHECKBOXES
    @FindBy(css = "li:nth-of-type(6) > a")
    public WebElement checkboxTest;
    public WebElement getCheckboxTest() {
        return checkboxTest;}

    //CONTEXTMENU
        @FindBy(css = "li:nth-of-type(7) > a")
        public WebElement contextMenuTest;
        public WebElement getContextMenuTest() {
            return contextMenuTest;}

    //Digest Auth
    @FindBy(css = "[href='\\/digest_auth']")
    public WebElement digestAuthTest;
    public WebElement getDigestAuthTest() {
        return digestAuthTest;}

    //Drag and Drop
    @FindBy(css = "[href='\\/drag_and_drop']")
    public WebElement dragDropTest;
    public WebElement getDragDropTest() {
        return dragDropTest;}

    //Dropdown
    @FindBy(css = "[href='\\/dropdown']")
    public WebElement dropDownTest;
    public WebElement getDropDownTest() {
        return dropDownTest;}

    //Dynamic Content     *********************Not done
    @FindBy(css = "[href='\\/dynamic_content']")
    public WebElement dynamicContentTest;
    public WebElement getDynamicContentTest() {
        return dynamicContentTest;}

    //File Download
//    @FindBy(css = "[href='\\/download']")
//    public WebElement fileDownloadTest;
//    public WebElement getFileDownloadTest() {
//        return fileDownloadTest;}

    //File Upload
    @FindBy(css = "[href='\\/upload']")
    public WebElement fileUploadTest;
    public WebElement getFileUploadTest() {
        return fileUploadTest;}


    //Forgot Password
    @FindBy(css = "[href='\\/forgot_password']")
    public WebElement forgetPasswordTest;
    public WebElement getForgetPasswordTest() {
        return forgetPasswordTest;}


//        11. Form Authentication
    @FindBy(css = "[href='\\/login']")
    public WebElement formAuth;
    public WebElement getFormAuthTest() {
        return formAuth;}

//        12. Frames  ********************Not Completed
    @FindBy(css = "[href='\\/frames']")
    public WebElement frameTestLink;
    public WebElement getFrameTestLink() {
        return frameTestLink;}

//        13. Horizontal Slider
@FindBy(css = "[href='\\/horizontal_slider']")
public WebElement sliderTestLink;
    public WebElement getSliderTestLink() {
        return sliderTestLink;}


//        14. Hovers
    @FindBy(css = "[href='\\/hovers']")
    public WebElement mouseHoversTestLink ;
    public WebElement getMouseHoversTestLink() {
        return mouseHoversTestLink;}


//        15. Infinite Scroll
    @FindBy(css = "[href='\\/infinite_scroll']")
    public WebElement InScrollTestLink ;
    public WebElement getInScrollTestLink() {
        return InScrollTestLink;}


//        16. Inputs
    @FindBy(css = "ul li:nth-of-type(27)")
    public WebElement inputsTestLink ;
    public WebElement getInputsTestLink() {
        return inputsTestLink;}


//        17. JavaScript Alerts


//        18. Multiple Windows
//        19. Nested Frames
//        20. Notification Messages
//        21. Redirect Link
//        22. Secure File Download







    }



