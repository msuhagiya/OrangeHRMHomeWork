package org.example;

import org.openqa.selenium.By;

public class AddEmployeePage extends Utils {
    //created variable for locator
 By _typeFirstName = By.xpath("//input[@id='firstName']");
 By _typeLastName = By.xpath("//input[@id='lastName']");
 By _clickOnCheckBox = By.id("chkLogin");
 By _typeUserName = By.xpath("//input[@id='user_name']");
 By _typePassword = By.xpath("//input[@id='user_password']");
 By _typeConfirmPassword = By.xpath("//input[@id='re_password']");
 By _clickOnSaveButton = By.id("btnSave");

 //Enter employee detail
 public void enterEmployeeDetail()
 {    //enter first name
     typeText(_typeFirstName,currentTimeStamp()+loadProp.getProperty("firstName"));
     //enter lastname
     typeText(_typeLastName,loadProp.getProperty("lastName"));
     //click on checkbox
     clickOnElement(_clickOnCheckBox);
     //enter username
     typeText(_typeUserName,loadProp.getProperty("employeeUserName"));
     //enter password
     typeText(_typePassword,loadProp.getProperty("employeePassWord"));
     //enter confirm password
     typeText(_typeConfirmPassword,loadProp.getProperty("confirmPassword"));
 }
 public void clickOnSaveButton()
 {   //click on save button
     clickOnElement(_clickOnSaveButton);
 }
}
