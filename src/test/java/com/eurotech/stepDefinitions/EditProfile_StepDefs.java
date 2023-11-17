package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.EditProfilPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditProfile_StepDefs {
    EditProfilPage editProfilPage =new EditProfilPage();
    DashboardPage dashboardPage=new DashboardPage();
    @When("The user select status {string}")
    public void the_user_select_status(String status) {
        editProfilPage.selectMenu(editProfilPage.selectBox,status );
    }
    @When("The user slides the slider {int}")
    public void the_user_slides_the_slider(int num) {
        editProfilPage.slider(num);
    }
    @When("The user add {string} {string}")
    public void the_user_add(String inputBoxNmae, String userInfo) {
        editProfilPage.addInfo(inputBoxNmae, userInfo);
    }
    @When("The user clicks on the submit button")
    public void the_user_clicks_on_the_submit_button() {
        editProfilPage.editProfileSubmitBtn.click();
    }
    @Then("The user verifies that {string} info in excel {string} {int}")
    public void the_user_verifies_that_info_in_excel(String infoTitle, String sheetName, int rowNumber) {
       String actualCompanyName=dashboardPage.getTextCommon(dashboardPage.getDataList(sheetName).get(rowNumber).get(infoTitle));
       System.out.println("actualCompanyName = " + actualCompanyName);
       Assert.assertEquals(dashboardPage.getDataList(sheetName).get(rowNumber).get(infoTitle),actualCompanyName);
    }

}