package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageInt { //Why we need this class???

    public WebDriver driver;

    public BasePageInt(WebDriver driver){
        this.driver = driver;
        this.inItPage();
    }

    public void inItPage(){
        PageFactory.initElements(driver,this);
    }

}
