package project.modules.register;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterPageActions {
    public static Performable enterFirstName(String firstName) {
        return Task.where("{0} enters first name '" + firstName + "'",
                Enter.theValue(firstName).into(RegisterPageObjects.FIRSTNAME_FIELD)
        );
    }
    public static Performable enterLastName(String lastName) {
        return Task.where("{0} enters last name '" + lastName + "'",
                Enter.theValue(lastName).into(RegisterPageObjects.LASTNAME_FIELD)
        );
    }
    public static Performable enterPhoneNumber(String phoneNum) {
        return Task.where("{0} enters phone number '" + phoneNum + "'",
                Enter.theValue(phoneNum).into(RegisterPageObjects.PHONE_FIELD)
        );
    }
    public static Performable enterEmailAddress(String email) {
        return Task.where("{0} enters email address '" + email + "'",
                Enter.theValue(email).into(RegisterPageObjects.EMAIL_FIELD)
        );
    }
    public static Performable enterUserName(String username) {
        return Task.where("{0} enters username '" + username + "'",
                Enter.theValue(username).into(RegisterPageObjects.USERNAME_FIELD)
        );
    }

    public static Performable enterPassword(String password) {
        return Task.where("{0} enters password '" + password + "'",
                Enter.theValue(password).into(RegisterPageObjects.PASSWORD_FIELD)
        );
    }
    public static Performable registerAccount() {
        return Task.where("{0} clicks Sign Up button",
                Click.on(RegisterPageObjects.SIGNUP_BUTTON)
        );
    }
}
