package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.EditProfilPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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
    @Then("The user verifies that profile info has been successfully updated")
    public void the_user_verifies_that_profile_info_has_been_successfully_updated() {
        Assert.assertTrue(editProfilPage.profileUpdatedMessage.isDisplayed());
    }
    @When("The user add following information into related inputBox")
    public void the_user_add_following_information_into_related_input_box(List<Map<String,String>> dataTable) {
        System.out.println("dataTable.size() = " + dataTable.size());
        for (int i = 0; i < dataTable.size(); i++) {
            System.out.println("i = " + i);
            System.out.println("dataTable.get(i).values() = " + dataTable.get(i).values());
            String [] dataArray=dataTable.get(i).values().toArray(new String[2]);

                if (dataArray.length>=2){
                    String firstElement=dataArray[0];
                    String secondElement=dataArray[1];
                    System.out.println("firstElement = " + firstElement);
                    System.out.println("secondElement = " + secondElement);
                    editProfilPage.addInfo(firstElement,secondElement);
                }else{
                    System.out.println("There is not enough element value");

            }
        }
    }

}