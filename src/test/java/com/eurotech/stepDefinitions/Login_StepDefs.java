package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

//   ExcelUtil excelUtil=new ExcelUtil("src/test/resources/Batch11_DevEx.xlsx","Test Data");
//   List<Map<String,String>> dataList=excelUtil.getDataList();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        //System.out.println("I open the browser and navigate to DevEx login page");
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        //System.out.println("I enter teacher username and password then click login button");
        loginPage.loginAsTeacher();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("I verify that URL is changed to dashboard");
        //Assert.assertTrue(100<99);
        String actualMessage = dashboardPage.welcomeText.getText();
        Assert.assertTrue("Verify welcome text includes 'Welcome'", actualMessage.contains("Welcome"));

    }

    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {
        //System.out.println("I enter student username and password then click login button.");
        loginPage.loginAsStudent();

    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        //System.out.println("I enter developer username and password then click login button.");
        loginPage.loginAsDeveloper();
    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username, password);

    }

    @Then("The welcome message contains {string}")
    public void the_welcome_message_contains(String user) {
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains(user));

    }

    @Then("The error message {string}")
    public void the_error_message(String expectedMessage) {
        // to find totally disappearing warning message
//        String validationMessage= loginPage.userEmailInput.getAttribute("validationMessage");
//        System.out.println("validationMessage = " + validationMessage);
//        Assert.assertEquals(expectedMessage,validationMessage);

        BrowserUtils.waitFor(2);
        String actualMessage = loginPage.getDisappearingWarningMessage(expectedMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @When("The user enters {string} and row number {int}")
    public void the_user_enters_and_row_number(String sheetName, int rowNum) {
//        ExcelUtil excelUtil=new ExcelUtil("src/test/resources/Batch11_DevEx.xlsx",sheetName);
//        List<Map<String, String>> dataList = excelUtil.getDataList();
//        loginPage.login(dataList.get(0).get("Username"),dataList.get(0).get("Password"));
//        loginPage.login(dataList.get(rowNum).get("Username"),dataList.get(rowNum).get("Password"));
        loginPage.login(loginPage.getDataList(sheetName).get(rowNum).get("Username"),loginPage.getDataList(sheetName).get(rowNum).get("Password"));
    }
    @Then("The user verifies that welcome message contains in excel {string} {int}")
    public void the_user_verifies_that_welcome_message_contains_in_excel(String sheetName,int rowNumForName ) {
        String actualMessage=dashboardPage.welcomeText.getText();
//        Assert.assertTrue(actualMessage.contains(dataList.get(rowNumForName).get("Name")));
        Assert.assertTrue(actualMessage.contains(loginPage.getDataList(sheetName).get(rowNumForName).get("Name")));
    }

}