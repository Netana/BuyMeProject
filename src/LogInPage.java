//    Registration to the site by e-mail address and password

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private static WebElement LogInButton = null;
    public static WebElement PressLogin(WebDriver driver) {
        LogInButton = driver.findElement(Constants.LogInLocator);
        LogInButton.click();
        return LogInButton;

        // click on the LoginPage
    }

    private static WebElement RegisterButton = null;
    public static WebElement RegisterToBuyMe(WebDriver driver) {
        RegisterButton = driver.findElement(Constants.DidNotRegister);
        RegisterButton.click();
        return RegisterButton;
    }

    private static WebElement EnterFirstName = null;
    public static WebElement MyName(WebDriver driver) {
        EnterFirstName = driver.findElement(Constants.FirstName);
        EnterFirstName.sendKeys("Neta Naor");
        return EnterFirstName;

        // enter email and password to register
    }

    private static WebElement EnterMail = null;
    public static WebElement MyMail(WebDriver driver) {
        EnterMail = driver.findElement(Constants.Email);
        EnterMail.sendKeys("Neta88586@gmail.com");
        return EnterMail;
    }
    private static WebElement EnterPassword = null;
    public static WebElement MyPassword(WebDriver driver) {
        EnterPassword = driver.findElement(Constants.Password);
        EnterPassword.sendKeys("Neta1121121");
        return EnterPassword;
    }
    private static WebElement Validation = null;
    public static WebElement FillVerify(WebDriver driver) {
        Validation = driver.findElement(Constants.ValidationPasssword);
        Validation.sendKeys("Neta1121121");
        return Validation;
    }
    private static WebElement regulations = null;
    public static WebElement ClickAgreeToSign(WebDriver driver) {
        regulations = driver.findElement(Constants.RegisterConsent);
        regulations.click();
        return regulations;
    }
    private static WebElement registration = null;
    public static WebElement RegistrationToBuyMe(WebDriver driver) {
        registration = driver.findElement(Constants.SubmitRegister);
        registration.click();
        return registration;
    }


}