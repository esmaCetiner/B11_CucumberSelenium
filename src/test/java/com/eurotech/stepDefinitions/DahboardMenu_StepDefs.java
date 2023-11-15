package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DahboardMenu_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("menuOptions = " + expectedList);
//        List<String> actualList=new ArrayList<>();
//        for (WebElement el : dashboardPage.menuList) {
//            actualList.add(el.getText());
 //       }
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList,actualList);
    }
    @When("The user in using following credentials")
    public void the_user_in_using_following_credentials(Map<String,String> userCredentials) {
        System.out.println("userCredentials = " + userCredentials);
        loginPage.login(userCredentials.get("userEmail"),userCredentials.get("password"));
        BrowserUtils.waitForVisibility(dashboardPage.welcomeText,10);
        Assert.assertTrue(dashboardPage.welcomeText.getText().contains(userCredentials.get("message")));
    }
    @Then("The user should be able to see following editAdd menu")
    public void the_user_should_be_able_to_see_following_edit_add_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("menuOptions = " + expectedList);
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.dashboardEditList);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList, actualList);
    }
}
