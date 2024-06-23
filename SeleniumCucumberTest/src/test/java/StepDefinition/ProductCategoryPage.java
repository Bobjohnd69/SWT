package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static pages.ProductCategoryPage.clickProductCategory;
import static pages.ProductCategoryPage.visibilityProductCategory;

public class ProductCategoryPage {
    @Then("^User should be able to view the product category page$")
    public void user_should_be_able_to_view_the_product_category_page() {
       String actualProductCategory = visibilityProductCategory();
       Assert.assertEquals(actualProductCategory, "Formal Shoes");
    }

    @Given("User navigates to the store page")
    public void userNavigatesToTheStorePage() {
        clickProductCategory();
    }
}
