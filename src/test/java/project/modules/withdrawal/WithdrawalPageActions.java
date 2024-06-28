package project.modules.withdrawal;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class WithdrawalPageActions {
    public static Performable selectAccount(String state) {
        return Task.where("{0} selects account '" + state + "'",
                SelectFromOptions.byVisibleText(state).from(WithdrawalPageObjects.ACCOUNT_TYPE)
        );
    }
    public static Performable enterAmount(String amount) {
        return Task.where("{0} input amount $'" + amount + "'",
                Enter.theValue(amount).into(WithdrawalPageObjects.AMOUNT)
        );
    }
    public static Performable clickWithdraw() {
        return Task.where("{0} clicks Deposit button",
                Click.on(WithdrawalPageObjects.WITHDRAW_BTN)
        );
    }
}
