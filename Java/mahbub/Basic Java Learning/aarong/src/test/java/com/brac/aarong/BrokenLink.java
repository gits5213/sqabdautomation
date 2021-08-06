package com.brac.aarong;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

    public static void main(){
        WebDriver driver = new ChromeDriver();
        String chromeDir = "C:\\Users\\Admin\\Desktop\\Github\\sqabdautomation\\Java\\mahbub\\Basic Java Learning\\aarong\\browser\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDir);
        driver.manage().window().maximize();


        driver.get("https://www.amazon.com/");




    }
}
