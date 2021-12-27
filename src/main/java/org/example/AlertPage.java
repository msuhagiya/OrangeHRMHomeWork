package org.example;

import org.openqa.selenium.By;

public class AlertPage extends Utils {
    //created variable for locator
    By _clickOnAlertOk = By.id("dialogDeleteBtn");
    public void clickOkOnAlertWindow()
    {    //click ok on alert window
        clickOnElement(_clickOnAlertOk);
        //waitForVisible(_clickOnAlertOk,20);
    }
}
