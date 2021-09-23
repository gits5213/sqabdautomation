package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenImagesPageAsif extends BasePageInt{
    public BrokenImagesPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']//img[@src='asdf.jpg']" )
    public WebElement brokenImage1;
/*    for (brokenImage1){
        //isImageBroken(brokenImage1);
    }*/
    public WebElement getBrokenImage1(){
        return brokenImage1;
    }

    @FindBy( xpath = "//div[@id='content']//img[@src='hjkl.jpg']" )
    public WebElement brokenImage2;
    public WebElement getBrokenImage2(){
        return brokenImage2;
    }

    @FindBy ( xpath = "//div[@id='content']//img[@src='img/avatar-blank.jpg']" )
    public WebElement notBrokenImage;
    public WebElement getNotBrokenImage(){
        return notBrokenImage;
    }
}
