package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement OpenShoppingcart;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipcode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement Continue;
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement Finishbutton;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement VerifyMsg;

    public void clickOnOpenShoppingcart(){
        clickOnElement(OpenShoppingcart);
        log.info("click On Open Shoppingcart : " + OpenShoppingcart.toString());
    }
    public void clickOncheckOut(){
        clickOnElement(checkOut);
        log.info("click On checkOut : " + checkOut.toString());
    }
    public void enterFirstname(String Firstname){
        sendTextToElement(firstname,Firstname);
        log.info("enter First name : " + firstname.toString());
    }
    public void enterLastname(String Lastname){
        sendTextToElement(lastname,Lastname);
        log.info("enter Last name : " + lastname.toString());
    }
    public void enterZipcode(String Zipcode){
        sendTextToElement(zipcode,Zipcode);
        log.info("enter Zip code : " + zipcode.toString());
    }
    public void enterFirstnameLastnameZipcode(String Firstname,String Lastname,String WD192RT){
        enterFirstname(Firstname);
        enterLastname(Lastname);
        enterZipcode(WD192RT);
    }
    public void clickOnContinue(){
        clickOnElement(Continue);
        log.info("click On Contonue : " + Continue.toString());
    }
    public void clickOnFinishbutton(){
        clickOnElement(Finishbutton);
        log.info("click On Finishbutton : " + Finishbutton.toString());
    }
    public String getVerifyMsg(){
        return getTextFromElement(VerifyMsg);
    }
}
