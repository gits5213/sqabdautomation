package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.JavaScriptAlertsPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class JavaScriptAlertsTcAsif extends BaseClass{

    @Test
    public void javaScriptAlertsTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        JavaScriptAlertsPageAsif jsapa = new JavaScriptAlertsPageAsif(driver);


        //TC-1. Click on Java Script Alerts Link
        tilp.getJavaScriptAlerts().click();
        sleepTest(3000);


        //TC-2. Click on JS Alert
        jsapa.getClickForJsAlert().click();
        sleepTest(2000);


        //TC-3. Accept the Alert
        String jsAlertTextPrint = driver.switchTo().alert().getText();
        System.out.println(jsAlertTextPrint);
        System.out.println( );


        //TC-4. Get text from Alert Result Text
        driver.switchTo().alert().accept();
        System.out.println("Js Alert:" + jsapa.getResultText().getText());
        sleepTest(5000);


        //TC-5. Click on JS Confirm
        jsapa.getClickForJsConfirm().click();
        sleepTest(2000);


        //TC-6. Get Text from Confirm Text alert
        String jsConfirmTextPrint = driver.switchTo().alert().getText();
        System.out.println(jsConfirmTextPrint);
        System.out.println( );
        sleepTest(2000);


        //TC-7.  Get text from Confirm Result Text
        driver.switchTo().alert().accept();
        System.out.println("Js Confirm:" + jsapa.getResultText().getText());
        sleepTest(3000);


        //TC-8. Click on JS Prompt
        jsapa.getClickForJsPrompt().click();
        sleepTest(2000);

        //TC-9. Get Text from Prompt Text alert
        String jsPromptTextPrint = driver.switchTo().alert().getText();
        System.out.println(jsPromptTextPrint);
        System.out.println( );

        //TC-10. Sending text
        driver.switchTo().alert().sendKeys("Text");
        sleepTest(3000);


        //TC-11.  Get Text from Prompt Text alert
        driver.switchTo().alert().accept();
        System.out.println("Js Prompt:" + jsapa.getResultText().getText());
        sleepTest(3000);

        //Okay the alert
/*
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Admin");
        sleepTest(10000);
        System.out.println("Fucker admin is here");
        alert.accept();
        sleepTest(10000);
        System.out.println("Fucker admin is FUCKED UP FINALLY");
*/

        //TC-12. Navigate to Internet Herokuapp home page.
        driver.navigate().back();
        sleepTest(2000);
    }
}
