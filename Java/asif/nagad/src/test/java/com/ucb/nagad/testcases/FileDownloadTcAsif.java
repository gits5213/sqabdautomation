package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.FileDownloadPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class FileDownloadTcAsif extends BaseClass{

    @Test
    public void fileDownloadTcAsif () throws AWTException {

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        FileDownloadPageAsif fdpa = new FileDownloadPageAsif(driver);


        //TC-1. Click on File Download Link
        tilp.getFileDownload().click();
        sleepTest(2000);


        //TC-2.  File Download URL Validation
        String fileDownloadUrl = driver.getCurrentUrl();
        System.out.println(fileDownloadUrl);
        Assert.assertEquals( fileDownloadUrl, Data.BASE_URL + Data.FILE_DOWNLOAD_URL_CONCAT );
        System.out.println("URL LINK MATCHED");


        //TC-3. Click on sample.pdf
        fdpa.getSamplePdf().click();
        sleepTest(5000);
        System.out.println(Data.DOWNLOAD_PATH_PC);


        //TC-4. Click and Download file- Check at computer after download
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        robot.keyPress(KeyEvent.VK_J);
        sleepTest(2000);

        robot.keyRelease(KeyEvent.VK_J);
        sleepTest(2000);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        File fileLocation =  new File(Data.DOWNLOAD_PATH_PC);
                File [] totalFiles = fileLocation.listFiles();
        for (File file:totalFiles){
            if ( file.getName().equals("SBSFacultyContactList.pdf") ){
                System.out.println("File download successfully");
                break;
            }

            else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }
        }

/*        File file = new File (Data.DOWNLOAD_PATH_PC);
        String [] currentFiles;
        if ( file.isDirectory() ){
            currentFiles = file.list();
            for (int i = 0; i < currentFiles.length; i++){
                File myFile = new File( File, currentFiles[i]);
                myFile.delete();
            }
        }
*/

        //TC-5. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(3000);
    }

}
