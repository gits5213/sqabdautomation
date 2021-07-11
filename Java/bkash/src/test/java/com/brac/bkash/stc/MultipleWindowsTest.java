package com.brac.bkash.stc;

import com.brac.bkash.Spages.LandingPage;
import com.brac.bkash.Spages.MultipleWindowsPage;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsTest extends BaseTest{

    @Test
    public void MultipleWindowsTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getMultipleWindowLink().click();
        sleepTest(1000);

        MultipleWindowsPage mwp = new MultipleWindowsPage(driver);
        mwp.getMultipleWindows().click();

        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);
        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        System.out.println(parentwindow);
        String childwindow = iterator.next();
        System.out.println(childwindow);
        driver.switchTo().window(childwindow);
        //String text = driver.findElement(By.cssSelector("body > div > h3")).getText();
        String text = mwp.getNewWindow().getText();
        System.out.println(text);
        sleepTest(2000);



        driver.navigate().back();
        sleepTest(1000);

    }

}
