package com.eurotech.pages;

import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage {

    @FindBy(id = "rcc-confirm-button")
    public WebElement understandBtn;

    @FindBy(id = "loginpage-input-email")
    public WebElement userEmailInput;

    @FindBy(id = "loginpage-form-pw-input")
    public WebElement userPasswordInput;

    @FindBy(id = "loginpage-form-btn")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[contains(text(),'Invalid Credentials!')]")
    public WebElement warningMessage;

    ///////////////////////////////////////////////////////////////////////////
    @FindAll({//logical or
            @FindBy(id = "loginpage-input-email"),
            @FindBy(name = "email")
    })
    public WebElement getUserEmailInputFindAll;

    @FindBys({//logical and
            @FindBy(id = "loginpage-form-pw-input"),
            @FindBy(xpath = "//input[@type='password']")
    })
    public WebElement getUserPasswordInputFindBys;
//
//    @FindBy(tagName = "li")
//    public List<WebElement> list;
    /////////////////////////////////////////////////////////////////////////////



    public void login(){
        String email=ConfigurationReader.get("email");
        String password=ConfigurationReader.get("password");

        understandBtn.click();
        userEmailInput.sendKeys(email);
        userPasswordInput.sendKeys(password);
        submitBtn.click();
    }
    public void login(String email,String password){

        understandBtn.click();
        userEmailInput.sendKeys(email);
        userPasswordInput.sendKeys(password);
        submitBtn.click();
    }

    public void loginAsTeacher(){
        String email=ConfigurationReader.get("email");
        String password=ConfigurationReader.get("password");

        understandBtn.click();
        userEmailInput.sendKeys(email);
        userPasswordInput.sendKeys(password);
        submitBtn.click();
    }
    public void loginAsStudent() {
        String email = ConfigurationReader.get("emailStudent");
        String password = ConfigurationReader.get("passwordStudent");

        understandBtn.click();
        userEmailInput.sendKeys(email);
        userPasswordInput.sendKeys(password);
        submitBtn.click();
    }
    public void loginAsDeveloper() {
        String email=ConfigurationReader.get("emailDeveloper");
        String password=ConfigurationReader.get("passwordDeveloper");

        understandBtn.click();
        userEmailInput.sendKeys(email);
        userPasswordInput.sendKeys(password);
        submitBtn.click();
    }

}
