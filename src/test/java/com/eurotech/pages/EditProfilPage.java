package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilPage extends BasePage{
    @FindBy(name = "githubusername")
    public WebElement githubusername;
    @FindBy(linkText = "Go Back")
    public WebElement goBackBtn;
    @FindBy(id = "editprofile-from-status-select")
    public WebElement selectBox;

    @FindBy(id = "slider-input")
    public WebElement l_slider;

    @FindBy(id = "editprofile-from-addsocial-btn")
    public WebElement editProfileSubmitBtn;

    @FindBy(xpath = "//*[.=''Profile Updated]")
    public WebElement profileUpdatedMessage;


    public void selectMenu(WebElement element,String status){
        Select select=new Select(element);
        select.selectByVisibleText(status);
    }
    public void slider(int num){
        int sliderNum= Integer.parseInt(l_slider.getAttribute("value"));
        for (int i = 0; i <sliderNum; i++) {
            l_slider.sendKeys(Keys.ARROW_LEFT);
        }
        for (int i = 0; i <num ; i++) {
            l_slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public void slider(int num,WebElement element,String value){
        int sliderNum= Integer.parseInt(element.getAttribute(value));
        for (int i = 0; i <sliderNum; i++) {
            l_slider.sendKeys(Keys.ARROW_LEFT);
        }
        for (int i = 0; i <num ; i++) {
            l_slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void addInfo(String inputBoxName,String userInfo){
        WebElement placeHolder = Driver.get().findElement(By.name(inputBoxName));
        placeHolder.clear();
        placeHolder.sendKeys(userInfo);

    }


}