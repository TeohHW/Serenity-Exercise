package project.modules.withdrawal;

import net.serenitybdd.screenplay.targets.Target;

class WithdrawalPageObjects {
    public static Target ACCOUNT_TYPE = Target.the("Account").locatedBy("//*[@id=\"accountType\"]");
    public static Target AMOUNT = Target.the("Amount").locatedBy("//*[@id=\"amount\"]");
    public static Target WITHDRAW_BTN = Target.the("Withdraw").locatedBy("/html/body/div[2]/div/div/form/button");

}
