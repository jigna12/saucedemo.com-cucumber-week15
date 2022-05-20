package com.saucedemo.steps;

import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String Username, String Password) {
        new LoginPage().loginUsernamePassword(Username,Password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickonloginbutton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String product) {
        new ProductPage().sortproductbyHighToLow(product);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new ProductPage().selectTheProductAndAddToCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new CheckOutPage().clickOnOpenShoppingcart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckOutPage().clickOncheckOut();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String zipcode) {
        new CheckOutPage().enterFirstnameLastnameZipcode(firstname,lastname,zipcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinue();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishbutton();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder(String errorMsg) {
        Assert.assertEquals("Error message not display",errorMsg,new CheckOutPage().getVerifyMsg());
    }

}
