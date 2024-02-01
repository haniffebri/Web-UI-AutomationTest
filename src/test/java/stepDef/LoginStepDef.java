package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import page.LoginPage;
import runner.BaseTest;


public class LoginStepDef extends BaseTest {

    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @When("user input username {string}")
    public void userInputUsername(String username) {

        By usernameInputText = By.cssSelector("input#user-name");
        loginPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("user able to see error messages {string}")
    public void userAbleTOSeeErrorMessages(String errorMessages) {
        loginPage.validateErrorAppear(errorMessages);
    }

    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String errorMessages) {
        loginPage.validateErrorAppear(errorMessages);
    }
}
