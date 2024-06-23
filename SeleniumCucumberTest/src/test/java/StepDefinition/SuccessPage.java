package StepDefinition;

import io.cucumber.java.en.Then;
import org.junit.Assert;

import static pages.SuccessPage.visibilitySuccess;

public class SuccessPage {
    @Then("User successfully add to cart")
    public void userSuccessfullyAddToCart() {
        String success = visibilitySuccess();
        Assert.assertEquals(success, "Added to Cart Successfully !!!");
    }
}
