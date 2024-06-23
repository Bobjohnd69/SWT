package StepDefinition;

import io.cucumber.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {

    @When("^User successfully enters the login details$")
    public void user_successfully_enters_the_login_details() {
        sendkeysUsername();
        sendkeysPassword();
        clickLoginButton();
    }
}
