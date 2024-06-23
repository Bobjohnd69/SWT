package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static pages.ShoePage.clickAddToCart;


public class ShoePage {
    @Then("User click buy")
    public void user_click_buy() {
        clickAddToCart();
    }
}
