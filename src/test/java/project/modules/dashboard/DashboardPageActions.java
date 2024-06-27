package project.modules.dashboard;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DashboardPageActions {
    public static Performable navigateToDashboard() {
        String environment = "environments." + Serenity.environmentVariables().getProperty("environment", "default");
        return Task.where("{0} navigates to dashboard",
                Open.url(Serenity.environmentVariables().getProperty(environment + ".webdriver.base.url"))
        );
    }
}
