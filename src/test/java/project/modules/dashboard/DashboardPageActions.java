package project.modules.dashboard;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class DashboardPageActions {
    public static Performable clickDeposit() {
        return Task.where("{0} click deposit button",
                Click.on(DashboardPageObjects.DEPOSIT_BUTTON)
        );
    }
    public static Performable clickWithdraw() {
        return Task.where("{0} clicks withdraw button",
                Click.on(DashboardPageObjects.WITHDRAW_BUTTON)
        );
    }
    public static Question<String> getPrimaryBalance() {
        return Text.of(DashboardPageObjects.CURRENT_PRIMARY_BALANCE).asString();
    }
    public static Question<String> getSavingsBalance() {
        return Text.of(DashboardPageObjects.CURRENT_SAVINGS_BALANCE).asString();
    }
}
