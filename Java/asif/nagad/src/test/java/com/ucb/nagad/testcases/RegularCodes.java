package com.ucb.nagad.testcases;

import com.ucb.nagad.internetpages.AbTestingPageAsif;
import com.ucb.nagad.internetpages.TheInternetLandingPage;
import org.testng.annotations.Test;

public class RegularCodes extends BaseClass{

    @Test
    public void regularCodes (){
        TheInternetLandingPage tilp = new TheInternetLandingPage(driver);
        AbTestingPageAsif atpa = new AbTestingPageAsif(driver);


        String baseDir = System.getProperty("user.dir");
        String chromeDir = baseDir + "/browser/chromedriver.exe";
        System.out.println(baseDir);
        System.out.println(chromeDir);
    }

}
