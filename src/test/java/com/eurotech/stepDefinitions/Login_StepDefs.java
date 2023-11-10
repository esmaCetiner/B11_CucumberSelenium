package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

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
        Assert.assertTrue("Verify welcome text includes 'Welcome'",actualMessage.contains("Welcome"));

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
        loginPage.login(username,password);

    }
    @Then("The welcome message contains {string}")
    public void the_welcome_message_contains(String user) {
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains(user));

    }



}
