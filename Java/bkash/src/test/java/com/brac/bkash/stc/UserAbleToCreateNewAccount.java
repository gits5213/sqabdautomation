package com.brac.bkash.stc;

import com.brac.bkash.Spages.LoginSingUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAbleToCreateNewAccount extends BaseTest {

    @Test
    public void userAbleToCreateNewAccount(){

        LoginSingUp lsp = new LoginSingUp(driver);

       // WebElement createNewAccount = driver.findElement(By.cssSelector("div:nth-of-type(5) > a[role='button']"));
        //System.out.println(createNewAccount.isDisplayed());
        if(lsp.getCreateNewAccount().isDisplayed()){
            //System.out.println(createNewAccount.getText());
            String createNewAccountText = lsp.getCreateNewAccount().getText();
            //Assert.assertTrue(createNewAccountText, true);
            Assert.assertEquals("Create New Account",createNewAccountText);
        }
        else{
            System.out.println("Create New Account is not displayed");
        }
        sleepTest(1000);


    }

}
