package project.modules.dashboard;

import net.serenitybdd.screenplay.targets.Target;

class DashboardPageObjects {
    public static Target CURRENT_PRIMARY_BALANCE = Target.the("Primary Balance").locatedBy("//input[@id='username']");
    public static Target CURRENT_SAVINGS_BALANCE = Target.the("Savings Balance").locatedBy("//input[@id='username']");
    public static Target DEPOSIT_BUTTON = Target.the("Deposit").locatedBy("/html/body/div[2]/div[2]/div[2]/div/a/div/span[1]");
    public static Target WITHDRAW_BUTTON = Target.the("Withdraw").locatedBy("/html/body/div[2]/div[2]/div[3]/div/a/div/span[1]");
}
