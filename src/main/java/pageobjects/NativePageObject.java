package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NativePageObject  {

    //  Sign In
    @AndroidFindBy(id ="platkovsky.alexey.epamtestapp:id/login_email")
    WebElement loginEmailField;

    @AndroidFindBy(id ="platkovsky.alexey.epamtestapp:id/login_pwd")
    WebElement login_pwdField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    WebElement signInBtn;


    // Create New Account
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    WebElement registerBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    WebElement eMailField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    WebElement usernameField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    WebElement passwordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    WebElement passwordConfirmField;

    //agreement
    @AndroidFindBy(id = "android.widget.CheckedTextView")
    WebElement CheckTextView;

    //@FindBy(xpath = "//*[contains(text(),'CheckedTextView')]")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup" +
            "/android.widget.FrameLayout[2]/android.widget.LinearLayout" +
            "/android.widget.ScrollView" +
            "/android.widget.LinearLayout/android.widget.CheckedTextView")
    WebElement CheckedTextView;


    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    WebElement registerNewAccountBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_cancel_button")
    WebElement registrationCancelBtn;

    // New Page with budget
    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/decor_content_parent")
    WebElement viewGroup;


    public NativePageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }


}
