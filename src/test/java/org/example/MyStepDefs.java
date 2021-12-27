package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    Utils utils = new Utils();
    AdminLogIn adminLogIn = new AdminLogIn();
    OrangeHRMMainPage orangeHRMMainPage = new OrangeHRMMainPage();
    PIMPage pimPage = new PIMPage();
    AddEmployeePage addEmployeePage = new AddEmployeePage();
    PersonalDetailPage personalDetailPage = new PersonalDetailPage();
    EmployeeListPage employeeListPage = new EmployeeListPage();
    AlertPage alertPage = new AlertPage();

    @Given("I am on login page")
    public void i_am_on_login_page() {

    }

    @When("I enter valid credential")
    public void i_enter_valid_credential() {
      adminLogIn.enterDetailsForAdminLogIn();
    }

    @When("click on login button")
    public void click_on_login_button() {
       adminLogIn.clickOnLoginButton();
    }

    @Then("I should be able to login successfully")
    public void i_should_be_able_to_login_successfully() {
     orangeHRMMainPage.verifyUserIsOnMainPage();
    }
    @When("I click on PIM menu name")
    public void i_click_on_pim_menu_name() {
        orangeHRMMainPage.clickOnPIMCategoryButton();
    }

    @When("I click on sub menu add employee")
    public void i_click_on_sub_menu_add_employee() {
        pimPage.clickOnAddEmployee();
    }

    @When("I enter valid details")
    public void i_enter_valid_details() {
        addEmployeePage.enterEmployeeDetail();
    }

    @When("I click on save button")
    public void i_click_on_save_button() {
        addEmployeePage.clickOnSaveButton();
    }

    @When("I click on welcome button and click on logout")
    public void i_click_on_welcome_button_and_click_on_logout() {
        personalDetailPage.clickOnWelcomeButtonAndLogout();
    }

    @When("employee enter valid credential")
    public void employee_enter_valid_credential() {
        adminLogIn.enterUserNameAndPasswordOfEmployee();
    }

    @Then("employee should able to login successfully")
    public void employee_should_able_to_login_successfully() {
        adminLogIn.clickOnLoginButton();
        orangeHRMMainPage.verifyEmployeeSuccessfullyLogIn();
    }
    @When("I click on sub menu employee list")
    public void i_click_on_sub_menu_employee_list() {
        pimPage.clickOnEmployeeList();

    }
    @When("I enter valid employee name")
    public void i_enter_valid_employee_name() {
        employeeListPage.enterEmployeeName();
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        employeeListPage.clickOnSearchButton();
    }

    @When("select valid employee name checkbox")
    public void select_valid_employee_name_checkbox() {
        employeeListPage.selectEmployeeNameCheckBox();
    }

    @When("I click on delete button")
    public void i_click_on_delete_button() {
        employeeListPage.clickOnDeleteButton();
        employeeListPage.clickOnOkOnPopUp();
    }

    @When("I click on ok alert button")
    public void i_click_on_ok_alert_button() {
        alertPage.clickOkOnAlertWindow();
    }

    @Then("I should be able to delete employee record successfully")
    public void i_should_be_able_to_delete_employee_record_successfully() {

    }
}
