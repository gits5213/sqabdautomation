package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPageAsif extends BasePageInt{
    public ContextMenuPageAsif(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='content']//h3[.='Context Menu']" )
    public WebElement contextMenuHead;
    public WebElement getContextMenuHead(){
        return contextMenuHead;
    }

    @FindBy ( xpath = "//div[@id='content']/div/p[1]" )
    public WebElement contextMenuPara1;
    public WebElement getContextMenuPara1 (){
        return contextMenuPara1;
    }

    @FindBy ( xpath = "//div[@id='content']/div/p[2]" )
    public WebElement contextMenuPara2;
    public WebElement getContextMenuPara2 () {
        return contextMenuPara2;
    }

    @FindBy ( xpath = "/html//div[@id='hot-spot']" )
    public WebElement hotBox;
    public WebElement getHotBox () {
        return hotBox;
    }


}
