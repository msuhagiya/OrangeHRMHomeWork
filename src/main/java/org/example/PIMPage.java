package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class PIMPage extends Utils {
     By _clickOnAddEmployOption = By.linkText("Add Employee");
     By _clickOnEmployeeListOption = By.linkText("Employee List");
    public void clickOnAddEmployee()
    {//click on sub category Add employee
        clickOnElement(_clickOnAddEmployOption);
    }
    public void clickOnEmployeeList()
    {//click on sub category employee list
        clickOnElement(_clickOnEmployeeListOption);
    }
}
