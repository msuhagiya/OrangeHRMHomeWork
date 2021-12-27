package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class EmployeeListPage extends Utils {
    //created variable for locatoe
    By _TypeEmployeeName = By.xpath("//input[@name='empsearch[employee_name][empName]']");
    By _clickOnSearchButton = By.xpath("//input[@id='searchBtn']");
    By _clickOnCheckBox = By.id("ohrmList_chkSelectAll");
    By _clickOnDeleteButton = By.xpath("//input[@class='delete']");
    public void enterEmployeeName()
    {
        waitForVisible(_TypeEmployeeName,20);
        //enter employee name
        typeText(_TypeEmployeeName,loadProp.getProperty("employeeName"));
    }
    public void clickOnSearchButton()
    {//click on search button
        clickOnElement(_clickOnSearchButton);
    }
    public void selectEmployeeNameCheckBox()
    {//select employee name by checkbox
        clickOnElement(_clickOnCheckBox);
    }
    public void clickOnDeleteButton()
    {//click on delete button
        clickOnElement(_clickOnDeleteButton);
    }
    //created method for alert handling
    public void clickOnOkOnPopUp()
    {
        //Alert alert = driver.switchTo().alert();
       // driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        //alert.accept();
    }
}
