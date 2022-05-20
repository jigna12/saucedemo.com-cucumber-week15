package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginbutton;

    public void enterusernaneField(String Username) {
        sendTextToElement(usernameField,Username);
        log.info("enter Username Field : " + usernameField.toString());
    }
    public void enterpasswordField(String Password) {
        sendTextToElement(passwordField,Password);
        log.info("enter Password Field : " + passwordField.toString());
    }
    public void loginUsernamePassword(String Username,String Password) {
        enterusernaneField(Username);
        enterpasswordField(Password);
    }
    public void clickonloginbutton() {
        clickOnElement(loginbutton);
        log.info("click on loginbutton : " + loginbutton.toString());
    }

}
