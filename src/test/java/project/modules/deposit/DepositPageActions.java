package project.modules.deposit;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DepositPageActions {

    public static Performable navigateToDepositPage() {
        String environment = "environments." + Serenity.environmentVariables().getProperty("environment", "default");
        return Task.where("{0} navigates to deposit page",
                Open.url(Serenity.environmentVariables().getProperty(environment + ".webdriver.base.url"))
        );
    }
    public static Performable selectAccount(String state) {
        return Task.where("{0} selects account '" + state + "'",
                SelectFromOptions.byVisibleText(state).from(DepositPageObjects.ACCOUNT_TYPE)
        );
    }
    public static Performable enterAmount(String amount) {
        return Task.where("{0} input amount '" + amount + "'",
                SelectFromOptions.byVisibleText(amount).from(DepositPageObjects.AMOUNT)
        );
    }
    public static Performable clickDeposit() {
        return Task.where("{0} clicks Deposit button",
                Click.on(DepositPageObjects.DEPOSIT_BTN)
        );
    }
}
