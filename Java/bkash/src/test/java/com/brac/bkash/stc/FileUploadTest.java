package com.brac.bkash.stc;

import com.brac.bkash.Spages.FileUploadPage;
import com.brac.bkash.Spages.LandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest{

    @Test
    public void FileUploadTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getFileUploadLink().click();
        sleepTest(3000);

        FileUploadPage fup = new FileUploadPage(driver);
        Actions act = new Actions(driver);
        act.moveToElement(fup.getFileUpload()).perform();
        sleepTest(2000);
        fup.getFileUpload().sendKeys("C:\\Users\\User\\Desktop\\pexels-photo.jpeg");

        driver.navigate().back();
        sleepTest(1000);

    }


}
