package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.HoversValidationPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversValidationTcAsif extends BaseClass{

    @Test
    public void hoversValidationTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        HoversValidationPageAsif hvpa = new HoversValidationPageAsif(driver);


        //TC-1. Click on Hover Page Link
        tilp.getHoversValidation().click();
        sleepTest(2000);


        //TC-2. Hover on image 1
        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(hvpa.getImageOne()).perform();
        sleepTest(2000);

        //TC-3. User Name One Print
        String userNameOne = hvpa.getNameUserOne().getText();
        System.out.println( userNameOne );
        sleepTest(2000);

        //TC-4. Profile view one print
        String profileViewOne = hvpa.getViewProfileOne().getText();
        System.out.println( profileViewOne );
        sleepTest(2000);
        System.out.println(" ");



        //TC-5. Hover on image 2
        Actions actionTwo = new Actions(driver);
        actionTwo.moveToElement(hvpa.getImageTwo()).perform();
        sleepTest(2000);

        //TC-6. User Name Two Print
        String userNameTwo = hvpa.getNameUserTwo().getText();
        System.out.println( userNameTwo );
        sleepTest(2000);

        //TC-7. Profile view two print
        String profileViewTwo = hvpa.getViewProfileTwo().getText();
        System.out.println( profileViewTwo );
        sleepTest(2000);
        System.out.println(" ");



        //TC-8.Hover on image 3
        Actions actionThree = new Actions(driver);
        actionThree.moveToElement(hvpa.getImageThree()).perform();
        sleepTest(2000);

        //TC-9. User Name Three Print
        String userNameThree = hvpa.getNameUserThree().getText();
        System.out.println( userNameThree );
        sleepTest(2000);

        //TC-10. Profile view three print
        String profileViewThree = hvpa.getViewProfileThree().getText();
        System.out.println( profileViewThree );
        sleepTest(2000);
        System.out.println(" ");


        //TC-11. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(2000);
    }
}
