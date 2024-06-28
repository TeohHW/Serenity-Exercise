package project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import project.Common;
import project.modules.deposit.DepositPageActions;
import project.modules.dashboard.DashboardPageActions;
import project.modules.login.LoginPageActions;
import project.modules.register.RegisterPageActions;
import project.modules.withdrawal.WithdrawalPageActions;

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
    }

    //Registering a new account
    @Given("{actor} is on the registration page")
    public void userIsOnTheRegistrationPage(Actor actor) {
        actor.attemptsTo(
                LoginPageActions.navigateToLoginPage(),
                LoginPageActions.clickSignUp()
        );
    }

    @When("{actor} input firstName {string}")
    public void userInputFirstNameFirstName(Actor actor, String firstName) {
        actor.attemptsTo(
                RegisterPageActions.enterFirstName(firstName)
        );
    }

    @And("{actor} input  lastName {string}")
    public void userInputLastNameLastName(Actor actor,String lastname) {
        actor.attemptsTo(
                RegisterPageActions.enterLastName(lastname)
        );
    }

    @And("{actor} input  phone {string}")
    public void userInputPhonePhone(Actor actor, String phoneNumber) {
        actor.attemptsTo(
                RegisterPageActions.enterPhoneNumber(phoneNumber)
        );
    }

    @And("{actor} input  emailAddress {string}")
    public void userInputEmailAddressEmailAddress(Actor actor,String email) {
        actor.attemptsTo(
                RegisterPageActions.enterEmailAddress(email)
        );
    }

    @And("{actor} input  username {string}")
    public void userInputUsernameUsername(Actor actor, String username) {
        actor.attemptsTo(
                RegisterPageActions.enterUserName(username)
        );
    }

    @And("{actor} input  password {string}")
    public void userInputPasswordPassword(Actor actor,String password) {
        actor.attemptsTo(
                RegisterPageActions.enterPassword(password)
        );
    }
    @Then("{actor} should be registered successfully")
    public void userShouldBeRegisteredSuccessfully(Actor actor) {
        actor.attemptsTo(
                RegisterPageActions.registerAccount()
        );
        Common.timeout(3000);
    }

    //Deposit
    @Given("{actor} is logged in with username {string} and password {string} and is on the Deposit page")
    public void userIsOnTheDepositPage(Actor actor, String username, String password) {
        actor.attemptsTo(
                LoginPageActions.navigateToLoginPage(),
                LoginPageActions.enterUserName(username),
                LoginPageActions.enterUserPassword(password),
                LoginPageActions.clickSignIn()
        );
        actor.remember("initialBalance", DashboardPageActions.getPrimaryBalance());
        Object recalledValue = actor.recall("initialBalance");
        System.out.println("Balance before deposit: " + " "+recalledValue.toString());
        actor.attemptsTo(
                DashboardPageActions.clickDeposit()
        );
    }
    @When("{actor} input account for deposit {string}")
    public void userInputAccountForDepositAccountType(Actor actor, String account) {
        actor.attemptsTo(
                DepositPageActions.selectAccount(account)
        );
    }
    @And("{actor} input the amount for deposit {string}")
    public void userInputTheAmountForDepositAmount(Actor actor,String amount) {
        actor.attemptsTo(
                DepositPageActions.enterAmount(amount)
        );
        actor.remember("amountDeposited", amount);
    }
    @And("{actor} submit the deposit")
    public void userSubmitTheDeposit(Actor actor) {
        actor.attemptsTo(
                DepositPageActions.clickDeposit()
        );
    }
    @Then("{actor} should deposit successfully")
    public void userShouldDepositSuccessfully(Actor actor) {
        Common.timeout(3000);
        System.out.println("Amount deposited: " + actor.recall("amountDeposited"));
        actor.remember("postBalance", DashboardPageActions.getPrimaryBalance());
        Object recallValue = actor.recall("postBalance");
        System.out.println("Balance AFTER deposit: " + " "+recallValue.toString());
    }

    //Withdraw

    @Given("{actor} is logged in with username {string} and password {string} and is on the Withdraw page")
    public void userIsOnTheWithdrawPage(Actor actor, String username, String password) {
        actor.attemptsTo(
                LoginPageActions.navigateToLoginPage(),
                LoginPageActions.enterUserName(username),
                LoginPageActions.enterUserPassword(password),
                LoginPageActions.clickSignIn()
        );
        actor.remember("initialBalance", DashboardPageActions.getPrimaryBalance());
        Object recalledValue = actor.recall("initialBalance");
        System.out.println("Balance before withdrawal: " + " "+recalledValue.toString());
        actor.attemptsTo(
                DashboardPageActions.clickWithdraw()
        );
    }
    @When("{actor} input account for withdrawal {string}")
    public void userInputAccountForWithdrawalAccountType(Actor actor,String account) {
        actor.attemptsTo(
                WithdrawalPageActions.selectAccount(account)
        );
    }
    @And("{actor} input the amount for withdrawal {string}")
    public void userInputTheAmountForWithdrawalAmount(Actor actor,String amount) {
        actor.attemptsTo(
                WithdrawalPageActions.enterAmount(amount)
        );
        actor.remember("amountWithdrawn",amount);
    }

    @And("{actor} submit the withdrawal")
    public void userSubmitTheWithdrawal(Actor actor) {
        actor.attemptsTo(
                WithdrawalPageActions.clickWithdraw()
        );
    }

    @Then("{actor} should withdraw successfully")
    public void userShouldWithdrawSuccessfully(Actor actor) {
        Common.timeout(3000);
        System.out.println("Amount withdrawn: " + actor.recall("amountWithdrawn"));
        actor.remember("postBalance", DashboardPageActions.getPrimaryBalance());
        Object recallValue = actor.recall("postBalance");
        System.out.println("Balance AFTER withdrawal: " + " "+recallValue.toString());
    }


}

