package com.eurotech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I open the browser and navigate to DevEx login page");
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        System.out.println("I enter teacher username and password then click login button");
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verify that URL is changed to dashboard");
    }
    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {
        System.out.println("I enter student username and password then click login button");

    }
    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        System.out.println("I enter developer username and password then click login button");
    }



}
