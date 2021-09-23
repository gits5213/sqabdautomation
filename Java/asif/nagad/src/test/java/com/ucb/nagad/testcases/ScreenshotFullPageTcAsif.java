package com.ucb.nagad.testcases;


import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class ScreenshotFullPageTcAsif extends BaseClass{

    @Test
    public void screenshotFullPageTcAsif () throws IOException, InterruptedException {

/*
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\nagad\\src\\test\\java\\com\\ucb\\nagad\\testcases\\abc1.jpg"));
        WebElement elements = driver.findElement(By.xpath("//div[@id='content']/ul//a[@href='/infinite_scroll']"));
        sleepTest(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int yPosition = elements.getLocation().getY();
        js.executeScript("window.scroll (0, " + yPosition + ") ");
        sleepTest(3000);
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile1, new File("C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\nagad\\src\\test\\java\\com\\ucb\\nagad\\testcases\\abc2.jpg"));
        driver.close();
*/

/*

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\nagad\\src\\test\\java\\com\\ucb\\nagad\\testcases\\abc3.jpg"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //closing the webdriver
        driver.close();

*/
/*        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\User\\Documents\\github-sqa\\sqabdautomation\\Java\\asif\\nagad\\src\\test\\java\\com\\ucb\\nagad\\testcases\\abc4.png"));
        driver.quit();
*/

        Thread.sleep(2000);
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(fpScreenshot.getImage(),"PNG",new File("D://FullPageScreenshot.png"));
    }
}
