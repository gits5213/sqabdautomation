package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.MultipleNewWindowsPageAsif;
import com.ucb.nagad.internetpages.MultipleWindowsPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import com.ucb.nagad.utility.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTcAsif extends BaseClass{

    @Test
    public void multipleWindowsTcAsif (){

        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        MultipleWindowsPageAsif mwpa = new MultipleWindowsPageAsif(driver);
        MultipleNewWindowsPageAsif mnwpa = new MultipleNewWindowsPageAsif(driver);


        //TC-1. Click on Multiple Windows Link
        tilp.getMultipleWindows().click();
        sleepTest(2000);

        //TC-2. Tab Title Validation
        String parentTabTile = driver.getTitle();
        System.out.println("Parent Tab Title is: " + parentTabTile);


        //TC-3. Click on Click Here
        mwpa.getClickHere().click();
        sleepTest(2000);

/*
        String WindowText = mwpa.getWindowText().getText();
        sleepTest(3000);
        System.out.println(WindowText);
*/

// It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                sleepTest(3000);
                System.out.println("New Window Title:- " + driver.switchTo().window(child_window).getTitle());
                driver.close();
            }

        }


        //TC-4. Switch to the parent window
        driver.switchTo().window(parent);
        sleepTest(3000);


        //TC-5. Navigate to Internet Herokuapp home page.
        driver.navigate().to(Data.BASE_URL);
        sleepTest(3500);


/*
        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        MultipleWindowsPageAsif mwpa = new MultipleWindowsPageAsif(driver);
        MultipleNewWindowsPageAsif mnwpa = new MultipleNewWindowsPageAsif(driver);

        tilp.getMultipleWindows().click();
        sleepTest(2000);


        //Click on Multiple Windows
        String tabTile = driver.getTitle();
        System.out.println("Tab Title is: " + tabTile);
        mwpa.getClickHere().click();
        sleepTest(2000);

        String WindowText = mwpa.getWindowText().getText();
        sleepTest(3000);
        System.out.println(WindowText);


        //New Window
        String newTabTile = driver.getTitle();
        System.out.println("Tab Title is: " + newTabTile);
        String newWindowText = mnwpa.getNewWindowText().getText();
        sleepTest(3000);
        System.out.println(newWindowText);

        driver.navigate().to(Data.BASE_URL);
        sleepTest(2000);
*/

    }

}
