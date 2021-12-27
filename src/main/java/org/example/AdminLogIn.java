package org.example;

import org.openqa.selenium.By;

public class AdminLogIn extends Utils {
    By _userName = By.id("txtUsername");
    By _password = By.id("txtPassword");
    By _clickOnLogIn = By.id("btnLogin");
    public void enterDetailsForAdminLogIn()
    {
        //Enter admin username
        typeText(_userName,loadProp.getProperty("adminUserName"));
        //Enter admin password
        typeText(_password,loadProp.getProperty("adminPassWord"));
    }
    public void clickOnLoginButton()
    {
        //click on login button
    clickOnElement(_clickOnLogIn);
    }

    public void enterUserNameAndPasswordOfEmployee()
    {   //enter employee user name
        typeText(_userName,loadProp.getProperty("employeeUserName"));
        //enter employee password
        typeText(_password,loadProp.getProperty("employeePassWord"));
    }
}
