$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("product.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Productpage"
    }
  ]
});
formatter.before({
  "duration": 3507069900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I filter the products by Price \"high to low\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter details firstname \"Krisha\", lastName \"Patel\" and zipPostalCode \"WD192RT\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should be able to see message \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 144292700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "ProSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 234157000,
  "status": "passed"
});
formatter.match({
  "location": "ProSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 142192500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "high to low",
      "offset": 32
    }
  ],
  "location": "ProSteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 117601300,
  "status": "passed"
});
formatter.match({
  "location": "ProSteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 135602400,
  "status": "passed"
});
formatter.match({
  "location": "ProSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 76543300,
  "status": "passed"
});
formatter.match({
  "location": "ProSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 82580200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krisha",
      "offset": 27
    },
    {
      "val": "Patel",
      "offset": 46
    },
    {
      "val": "WD192RT",
      "offset": 72
    }
  ],
  "location": "ProSteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 310501900,
  "status": "passed"
});
formatter.match({
  "location": "ProSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 97083700,
  "status": "passed"
});
formatter.match({
  "location": "ProSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 86699600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 33
    }
  ],
  "location": "ProSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder(String)"
});
formatter.result({
  "duration": 44489600,
  "status": "passed"
});
formatter.after({
  "duration": 747253800,
  "status": "passed"
});
});