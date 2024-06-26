package project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import project.Common;
import project.modules.login.LoginPageActions;

public class StepDefinitions {

    @Given("{actor} is logged in with username {string} and password {string}")
    public void userIsLoggedIn(Actor actor, String username, String password) {
        actor.attemptsTo(
                LoginPageActions.navigateToLoginPage(),
                LoginPageActions.enterUserName(username),
                LoginPageActions.enterUserPassword(password),
                LoginPageActions.clickSignIn()
        );
    }

    @Given("{actor} is on the login page")
    public void userIsOnTheLoginPage(Actor actor) {
        actor.attemptsTo(
                LoginPageActions.navigateToLoginPage()
        );
    }

    @When("{actor} input username {string} and password {string}")
    public void userInputUsernameUsernameAndPasswordPassword(Actor actor, String username, String password) {
        actor.attemptsTo(
                LoginPageActions.enterUserName(username),
                LoginPageActions.enterUserPassword(password)
        );
        Common.timeout(5000);
    }

    @And("{actor} submit the login form")
    public void userSubmitTheLoginForm(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                LoginPageActions.clickSignIn()
        );
    }

    @Then("{actor} should be authenticated successfully")
    public void userShouldBeAuthenticatedSuccessfully(Actor actor) {
        Common.timeout(3000);
    }
}
