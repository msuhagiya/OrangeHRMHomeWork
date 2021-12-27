package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrangeHRMMainPage extends Utils{
    By _clickOnPIMButton = By.xpath("//a[@id=\"menu_pim_viewPimModule\"]/b");
    By _verifyEmployeeSuccessfullyLogin = By.id("welcome");
    public void verifyUserIsOnMainPage()
    {//verify user is on main page by assert
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
    public void clickOnPIMCategoryButton()
    {//click on PIM category
        clickOnElement(_clickOnPIMButton);
    }
    public void verifyEmployeeSuccessfullyLogIn()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains());
       //String actualResult = getTextFromElement(_verifyEmployeeSuccessfullyLogin);
        //System.out.println(actualResult);
        //String expectedResult = "Welcome"+currentTimeStamp()+"Hellan";
       // Assert.assertEquals(actualResult,expectedResult,"Employee is not logged in");
        //Assert.assertTrue(Boolean.parseBoolean(getTextFromElement(_verifyEmployeeSuccessfullyLogin)),expectedResult);
    }
}
