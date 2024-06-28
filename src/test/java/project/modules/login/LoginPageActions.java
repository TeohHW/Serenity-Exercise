package project.modules.login;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class LoginPageActions {

    public static Performable navigateToLoginPage() {
        String environment = "environments." + Serenity.environmentVariables().getProperty("environment", "default");
        return Task.where("{0} navigates to login page",
                Open.url(Serenity.environmentVariables().getProperty(environment + ".webdriver.base.url"))
        );
    }

    public static Performable enterUserName(String username) {
        return Task.where("{0} enters username '" + username + "'",
                Enter.theValue(username).into(LoginPageObjects.USERNAME_FIELD)
        );
    }

    public static Performable enterUserPassword(String password) {
        return Task.where("{0} enters password '" + password + "'",
                Enter.theValue(password).into(LoginPageObjects.PASSWORD_FIELD)
        );
    }

    public static Performable clickSignIn() {
        return Task.where("{0} clicks Sign In button",
                Click.on(LoginPageObjects.SIGNIN_BUTTON)
        );
    }
    public static Performable clickSignUp() {
        return Task.where("{0} clicks Sign Up button",
                Click.on(LoginPageObjects.SIGNUP_BUTTON)
        );
    }
}
