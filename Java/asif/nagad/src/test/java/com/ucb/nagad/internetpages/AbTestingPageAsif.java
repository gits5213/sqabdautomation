package com.ucb.nagad.internetpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbTestingPageAsif extends BasePageInt{
    public AbTestingPageAsif(WebDriver driver) {

        super(driver);
    }

    //A/B Test Variation 1
    @FindBy(xpath = "//div[@id='content']//h3[.='A/B Test Variation 1']")
    public WebElement abTestingVariation;
    public WebElement getAbTestingVariation (){

        return abTestingVariation;
    }

    //A/B Test Control
    @FindBy(css = "#content  div  h3")
    public WebElement abTestingVariationcontrol;
    public WebElement getAbTestingVariationControl (){

        return abTestingVariationcontrol;
    }

    //ab testing variation para
    @FindBy(xpath = "//div[@id='content']//p")
    public WebElement abTestingVariationPara;
    public WebElement getAbTestingVariationPara (){

        return abTestingVariationPara;
    }

}
