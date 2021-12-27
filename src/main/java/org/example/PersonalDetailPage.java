package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PersonalDetailPage extends Utils{
    By _clickOnWelcome = By.xpath("//a[@id='welcome']");
    By _moveToLogOut = By.xpath("//div[@id='welcome-menu']/ul/li[3]/a");
    public void clickOnWelcomeButtonAndLogout()
    {//click on welcome on top righthand side of the page
        clickOnElement(_clickOnWelcome);
        //called action class for mouse hovering action
        Actions actions = new Actions(driver);
        WebElement subOption = driver.findElement(_moveToLogOut);
        //actions.moveToElement(subOption).build().perform();
        //waitForClickable(_moveToLogOut,30);
        //actions.click(subOption);
        subOption.click();
    }
}
