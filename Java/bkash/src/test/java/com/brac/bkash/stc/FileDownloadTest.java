package com.brac.bkash.stc;

import com.brac.bkash.Spages.FileDownloadPage;
import com.brac.bkash.Spages.LandingPage;
import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest{

    @Test
    public void FileDownloadTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getFileDownloadLink().click();
        sleepTest(1000);


        FileDownloadPage fdp = new FileDownloadPage(driver);
        fdp.getFileDownload().click();
        sleepTest(2000);

        driver.navigate().back();
        sleepTest(1000);


    }


}
