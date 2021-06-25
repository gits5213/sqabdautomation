package com.brac.bkash.liveProject.rakibuzzaman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{
    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-of-type(1) a")
    public WebElement abTestingLink;

    @FindBy(css = "li:nth-of-type(2) > a")
    public WebElement addRemoveElementsLink;

    @FindBy(css = "li:nth-of-type(3) > a")
    public WebElement basicAuthLink;

    @FindBy(css = "li:nth-of-type(6) > a")
    public WebElement checkboxesLink;

    @FindBy(css = "li:nth-of-type(7) > a")
    public WebElement contextMenuLink;


    @FindBy(css = "li:nth-of-type(10) > a")
    public WebElement dragAndDropLink;

    @FindBy(css = "li:nth-of-type(11) > a")
    public WebElement dropdownLink;

    @FindBy(css = "li:nth-of-type(12) > a")
    public WebElement dynamicContentLink;

    @FindBy(css = "li:nth-of-type(17) > a")
    public WebElement fileDownloadLink;

    @FindBy(css = "li:nth-of-type(18) > a")
    public WebElement fileUploadLink;

    @FindBy(css = "li:nth-of-type(20) > a")
    public WebElement forgotPasswordLink;

    @FindBy(css = "li:nth-of-type(21) > a")
    public WebElement formAuthenticationLink;

    @FindBy(css = "li:nth-of-type(22) > a")
    public WebElement framesLink;

    @FindBy(css = "li:nth-of-type(24) > a")
    public WebElement horizontalSliderLink;

    @FindBy(css = "li:nth-of-type(25) > a")
    public WebElement hoversLink;

    @FindBy(css = "li:nth-of-type(26) > a")
    public WebElement infiniteScrollLink;

    @FindBy(css = "li:nth-of-type(27) > a")
    public WebElement inputsLink;

    @FindBy(css = "li:nth-of-type(29) > a")
    public WebElement javaScriptAlertsLink;

    @FindBy(css = "li:nth-of-type(33) > a")
    public WebElement multipleWindowsLink;

    @FindBy(css = "li:nth-of-type(34) > a")
    public WebElement nestedFramesLink;

    @FindBy(css = "li:nth-of-type(35) > a")
    public WebElement notificationMessagesLink;

    @FindBy(css = "li:nth-of-type(36) > a")
    public WebElement redirectLinkLink;








    public WebElement getAbTestingLink() {
        return abTestingLink;
    }
    public WebElement getAddRemoveElementsLink() {
        return addRemoveElementsLink;
    }
    public WebElement getBasicAuthLink() {  return basicAuthLink;  }
    public WebElement getCheckboxesLink() {  return checkboxesLink; }
    public WebElement getContextMenuLink() {  return contextMenuLink; }
    public WebElement getDragAndDropLink() {  return dragAndDropLink; }
    public WebElement getDropdownLink() {  return dropdownLink; }
    public WebElement getDynamicContentLink() {  return dynamicContentLink; }
    public WebElement getFileDownloadLink() {  return fileDownloadLink; }
    public WebElement getFileUploadLink() {  return fileUploadLink; }
    public WebElement getForgotPasswordLink() {  return forgotPasswordLink; }
    public WebElement getFormAuthenticationLink() {  return formAuthenticationLink; }
    public WebElement getFramesLink() {  return framesLink; }
    public WebElement getHorizontalSliderLink() {  return horizontalSliderLink; }
    public WebElement getHoversLink() {  return hoversLink; }
    public WebElement getInfiniteScrollLink() {  return infiniteScrollLink; }
    public WebElement getInputsLink() {  return inputsLink; }
    public WebElement getJavaScriptAlertsLink() {  return javaScriptAlertsLink; }
    public WebElement getMultipleWindowsLink() {  return multipleWindowsLink; }
    public WebElement getNestedFramesLink() {  return nestedFramesLink; }
    public WebElement getNotificationMessagesLink() {  return notificationMessagesLink; }
    public WebElement getRedirectLinkLink() {  return redirectLinkLink; }



    }