package project.modules.dashboard;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DashboardPageActions {
    public static Performable clickDeposit() {
        return Task.where("{0} click deposit button",
                Click.on(DashboardPageObjects.DEPOSIT_BUTTON)
        );
    }
    public static void setPrimaryBalance() {
        Serenity.setSessionVariable("balance").to(DashboardPageObjects.CURRENT_PRIMARY_BALANCE);
        String balanceBefore = Serenity.sessionVariableCalled("balance");
        System.out.println("Balance before deposit: " +balanceBefore);
    }
    public static Performable clickWithdraw() {
        return Task.where("{0} clicks withdraw button",
                Click.on(DashboardPageObjects.WITHDRAW_BUTTON)
        );
    }
}
