package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenu_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("I verified that welcome text is here");
    }
    @When("The user navigates to Developer Menu")
    public void the_user_navigates_to_developer_menu() {
        System.out.println("The user navigates to developer menu");
    }
    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {
        System.out.println("I verified that developer text is here");
    }

    @When("The user navigates to All Posts Menu")
    public void the_user_navigates_to_all_posts_menu() {
        System.out.println("The user navigates to All Posts menu");
    }
    @Then("The user able to see Posts text")
    public void the_user_able_to_see_posts_text() {
        System.out.println("I verified that All Posts text is here");
    }

    @When("The user navigates to My Account Menu")
    public void the_user_navigates_to_my_account_menu() {
        System.out.println("The user navigates to My Account menu");
    }
    @Then("The user able to see Dashboard text")
    public void the_user_able_to_see_dashboard_text() {
        System.out.println("I verified that Dashboard text is here");
    }
    @When("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menuName) {
        System.out.println("menuName = " + menuName);
        dashboardPage.navigateToMenu(menuName);
    }
    @Then("The user should be able to see header as {string}")
    public void the_user_should_be_able_to_see_header_as(String header) {
        System.out.println("header = " + header);
        String actualHeaderText= dashboardPage.getHeaderText(header);
        Assert.assertEquals("Verify that the header name is displayed",header,actualHeaderText);
    }


}