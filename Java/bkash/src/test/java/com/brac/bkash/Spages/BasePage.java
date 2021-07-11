package com.brac.bkash.Spages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public BasePage (WebDriver driver){
        this.driver = driver;
        this.inITPage();
    }
    public void inITPage(){
        PageFactory.initElements(driver, this);
    }
}
