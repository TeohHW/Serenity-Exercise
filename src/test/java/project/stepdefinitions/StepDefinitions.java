package project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import project.Common;
import project.modules.deposit.DepositPageActions;
import project.modules.login.LoginPageActions;
import project.modules.register.RegisterPageActions;

public class StepDefinitions {

    //Login
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

    //Registering a new account
    @Given("User is on the registration page")
    public void userIsOnTheRegistrationPage(Actor actor) {
        actor.attemptsTo(
                RegisterPageActions.navigateToRegistrationPage()
        );
    }

    @When("{actor} input firstName {string}")
    public void userInputFirstNameFirstName() {

    }

    @And("{actor} input  lastName {string}")
    public void userInputLastNameLastName() {

    }

    @And("{actor} input  phone {string}")
    public void userInputPhonePhone() {

    }

    @And("{actor} input  emailAddress {string}")
    public void userInputEmailAddressEmailAddress() {

    }

    @And("{actor} input  username {string}")
    public void userInputUsernameUsername() {

    }

    @And("{actor} input  password {string}")
    public void userInputPasswordPassword() {
    }
    @When("{actor} clicks on sign up button")
    public void userClicksOnSignUpButton(Actor actor) {
        actor.attemptsTo(
                RegisterPageActions.registerAccount()
        );
    }

    @Then("{actor} should be registered successfully")
    public void userShouldBeRegisteredSuccessfully(Actor actor) {
        Common.timeout(3000);
    }
    @Then("{actor} should be redirected to registration page")
    public void userShouldBeRedirectedToRegistrationPage(Actor actor) {
        actor.attemptsTo(
                LoginPageActions.navigateToLoginPage()
        );
    }
    //Deposit
    @Given("{actor} is on the deposit page")
    public void userIsOnTheDepositPage(Actor actor) {
            DepositPageActions.navigateToDepositPage();
    }
    @When("{actor} input account {string} and amount {string}")
    public void userInputAccountAccountTypeAndAmountAmount(Actor actor, String account, String amount) {
        actor.attemptsTo(
                DepositPageActions.selectAccount(account),
                DepositPageActions.enterAmount(amount)
        );
    }
    @And("{actor} submit the deposit")
    public void userSubmitTheDeposit(Actor actor) {
        actor.attemptsTo(
                DepositPageActions.navigateToDepositPage()
        );
    }
    @Then("{actor} should deposit successfully")
    public void userShouldDepositSuccessfully(Actor actor) {
        Common.timeout(3000);
    }
    //Withdraw
}
