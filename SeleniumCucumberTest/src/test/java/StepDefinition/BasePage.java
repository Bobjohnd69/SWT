package StepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class BasePage {
    @Given("^User navigates to the login page$")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        clickHamburgerMenu();
        clickSignInLink();
    }
}
