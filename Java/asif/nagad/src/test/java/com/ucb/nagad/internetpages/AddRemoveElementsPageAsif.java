package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementsPageAsif extends BasePageInt{

    public AddRemoveElementsPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']/h3[.='Add/Remove Elements']")
    public WebElement addRemoveElementsHeader;
    public WebElement getAddRemoveElementsHeader(){
        return addRemoveElementsHeader;
    }

    @FindBy(xpath = "//div[@id='content']//button[.='Add Element']")
    public WebElement addElementButtonClicked;
    public WebElement getAddElementButtonClicked(){
        return addElementButtonClicked;
    }

    @FindBy(xpath = "//div[@id='elements']/button[@class='added-manually']")
    public WebElement deleteButton;
    public WebElement getDeleteButton(){
        return deleteButton;
    }


}
