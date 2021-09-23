package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.FileUploadPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadTcAsif extends BaseClass{

    @Test
    public void fileUploadTcAsif () throws AWTException {


        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        FileUploadPageAsif fupa = new FileUploadPageAsif(driver);


        //TC-1.Click on File Upload Link
        tilp.getFileUpload().click();
        sleepTest(2000);

        //CHOOSE FIELD INPUT FIELD BUTTON or what?
        //What is the activities of SENDKEYS.

        //TC-2. Click on choose file and click on upload button
        fupa.getChooseFileButton().sendKeys(Data.pdfDir);
        fupa.getUploadButton().click();
        sleepTest(2000);


        //TC-3. After click on upload forward to a page where show uploaded file
        //TC-3. Then come back to File Upload Page
        driver.navigate().back();
        sleepTest(2000);

        //How to validate at SENDKEYS & AFTER UPLOAD???
        //After upload if we wanted to validate what we uploaded how to do that?


        //Starting drag and drop
        //TC-4. Click on red box
        driver.get(Data.FILE_UPLOAD_URL);
        fupa.getDragDropUploadBox().click();
        sleepTest(2000);


        //
        Robot robot = new Robot();
        //To save URL into a variable we use STRINGSELECTION
        StringSelection filepath = new StringSelection(Data.pdfDir);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);

        //Now press CTRL
        robot.keyPress(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        //Press V
        robot.keyPress(KeyEvent.VK_V);
        sleepTest(2000);

        //Release V
        robot.keyRelease(KeyEvent.VK_V);
        sleepTest(2000);

        //Release CTRL
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleepTest(2000);

        //Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        sleepTest(2000);

        System.out.println("File uploaded successfully by using Robot class");


        //TC-5. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(3000);
    }
}