package project.modules.register;

import net.serenitybdd.screenplay.targets.Target;

class RegisterPageObjects {
    public static Target FIRSTNAME_FIELD = Target.the("First Name").locatedBy("//*[@id=\"firstName\"]");
    public static Target LASTNAME_FIELD = Target.the("Last Name").locatedBy("//*[@id=\"lastName\"]");
    public static Target PHONE_FIELD = Target.the("Phone number").locatedBy("//*[@id=\"phone\"]");
    public static Target EMAIL_FIELD = Target.the("Email address").locatedBy("//*[@id=\"email\"]");
    public static Target USERNAME_FIELD = Target.the("Username").locatedBy("//*[@id=\"username\"]");
    public static Target PASSWORD_FIELD = Target.the("User Password").locatedBy("//*[@id=\"password\"]");
    public static Target SIGNUP_BUTTON = Target.the("Sign Up").locatedBy("/html/body/div[1]/div/div[2]/form/div[7]/button");
}
