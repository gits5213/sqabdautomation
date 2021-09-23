package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.AddRemoveElementsPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTcAsif extends BaseClass{

    @Test
    public void addRemoveElementsTcAsif(){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        AddRemoveElementsPageAsif arep = new AddRemoveElementsPageAsif(driver);

        if ( tilp.getAddRemoveElements().isDisplayed() ){
            String addRemoveElements = tilp.getAddRemoveElements().getText();
            Assert.assertEquals(Data.ADD_REMOVE_ELEMENTS, addRemoveElements);
        }
        else{
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //TC-1. Click on Add/Remove Elements
        tilp.getAddRemoveElements().click();
        sleepTest(2000);

        if (arep.getAddRemoveElementsHeader().isDisplayed()){
            String addElement = arep.getAddElementButtonClicked().getText();
            Assert.assertEquals(Data.ADD_ELEMENT, addElement);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        //TC-2. Click on add element
        arep.getAddElementButtonClicked().click();
        sleepTest(3000);

        if( arep.getDeleteButton().isDisplayed() ){
            String deleteButton = arep.getDeleteButton().getText();
            Assert.assertEquals(Data.DELETE_BUTTON, deleteButton);
        }

        //TC-3. Click on Delete
        arep.getDeleteButton().click();
        sleepTest(2000);

        driver.navigate().back();
        sleepTest(2000);
    }

}
