package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetLandingPage extends BasePageInt {


    public TheInternetLandingPage(WebDriver driver) {

        super(driver);
    }

    //WebElement abTestingVariation1 = driver.findElement(By.xpath("//div[@id='content']//h3[.='A/B Test Variation 1']"));
    //Welcome to the-internet
    @FindBy(xpath="//div[@id='content']/h1[@class='heading']")
    public WebElement h1text;
    public WebElement getH1text(){

        return h1text;
    }

    //Available Examples
    @FindBy(xpath = "//div[@id='content']/h2[.='Available Examples']")
    public WebElement h2text;
    public WebElement getH2text(){

        return h2text;
    }

    //A/B Testing
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/abtest']")
    public WebElement abTesting;
    public WebElement getAbTesting (){

        return abTesting;
    }

    //Add/Remove Elements
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/add_remove_elements/']")
    public WebElement addRemoveElements;
    public WebElement getAddRemoveElements (){

        return addRemoveElements;
    }

    //Basic Auth
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/basic_auth']")
    public WebElement basicAuth;
    public WebElement getBasicAuth (){

        return basicAuth;
    }

    //Broken Images
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/broken_images']")
    public WebElement brokenImages;
    public WebElement getBrokenImages (){

        return brokenImages;
    }

    //Checkboxes
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/checkboxes']")
    public WebElement checkBox;
    public WebElement getCheckBox(){
        return checkBox;
    }

    //Context Menu
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/context_menu']")
    public WebElement contextNow;
    public WebElement getContextNow(){
        return contextNow;
    }

    //Digest Authentication
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/digest_auth']" )
    public WebElement digestAuthentication;
    public WebElement getDigestAuthentication()
    {
        return digestAuthentication;
    }

    //Disappearing Elements
    @FindBy(xpath = "//div[@id='content']/ul//a[@href='/disappearing_elements']" )
    public WebElement disappearingElements;
    public WebElement getDisappearingElements(){
        return disappearingElements;
    }

    //Drag and Drop
    @FindBy( xpath = "//div[@id='content']/ul//a[@href='/drag_and_drop']")
    public WebElement dragAndDrop;
    public WebElement getDragAndDrop(){
        return dragAndDrop;
    }

    //Dropdown
    @FindBy( xpath = "//div[@id='content']/ul//a[@href='/dropdown']")
    public WebElement dropDown;
    public WebElement getDropDown(){
        return dropDown;
    }

    //Dynamic Content
    @FindBy( xpath = "//div[@id='content']/ul//a[@href='/dynamic_content']")
    public WebElement dynamicContent;
    public WebElement getDynamicContent(){
        return dynamicContent;
    }

    //Dynamic Controls
    @FindBy( xpath = "//div[@id='content']/ul//a[@href='/dynamic_controls']")
    public WebElement dynamicControls;
    public WebElement getDynamicControls(){
        return dynamicControls;
    }

    //File Download
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/download']" )
    public WebElement fileDownload;
    public WebElement getFileDownload(){
        return fileDownload;
    }

    //File Upload
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/upload']" )
    public WebElement fileUpload;
    public WebElement getFileUpload(){
        return fileUpload;
    }

    //Forgot Password
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/forgot_password']")
    public WebElement forgotPassword;
    public WebElement getForgotPassword(){
        return forgotPassword;
    }

    //Form Authentication
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/login']")
    public WebElement formAuthentication;
    public WebElement getFormAuthentication(){
        return formAuthentication;
    }

    //Frames
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/frames']")
    public WebElement frameValidation;
    public WebElement getFrameValidation(){
        return frameValidation;
    }

    //Horizontal Slider
    @FindBy( xpath = "//div[@id='content']/ul//a[@href='/horizontal_slider']")
    public WebElement horizontalSlider;
    public WebElement getHorizontalSlider(){
        return horizontalSlider;
    }

    //Hovers
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/hovers']")
    public WebElement hoversValidation;
    public WebElement getHoversValidation(){
        return hoversValidation;
    }

    //Infinite Scroll
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/infinite_scroll']")
    public WebElement infiniteScroll;
    public WebElement getInfiniteScroll(){
        return infiniteScroll;
    }

    //Inputs
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/inputs']" )
    public WebElement inputsValidation;
    public WebElement getInputsValidation(){
        return inputsValidation;
    }

    //JavaScript Alerts
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/javascript_alerts']")
    public WebElement javaScriptAlerts;
    public WebElement getJavaScriptAlerts(){
        return javaScriptAlerts;
    }

    //Multiple Windows
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/windows']" )
    public WebElement multipleWindows;
    public WebElement getMultipleWindows(){
        return multipleWindows;
    }

    //Notification Messages
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/notification_message']" )
    public WebElement notificationMessages;
    public WebElement getNotificationMessages(){
        return notificationMessages;
    }

    //Redirect Link
    @FindBy ( xpath = "//div[@id='content']/ul//a[@href='/redirector']" )
    public WebElement redirectLink;
    public WebElement getRedirectLink(){
        return redirectLink;
    }

}
