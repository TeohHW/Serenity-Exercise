package project.modules.withdrawal;

import net.serenitybdd.screenplay.targets.Target;

class WithdrawalPageObjects {
    public static Target USERNAME_FIELD = Target.the("User Name").locatedBy("//input[@id='username']");
    public static Target PASSWORD_FIELD = Target.the("User Password").locatedBy("//input[@id='password']");
    public static Target SIGNIN_BUTTON = Target.the("Sign In").locatedBy("//button[normalize-space()='Sign in']");
    public static Target SIGNUP_BUTTON = Target.the("Sign Up").locatedBy("//a[@type='submit' and contains(@class, 'login-button') and @href='/signup']");

}
