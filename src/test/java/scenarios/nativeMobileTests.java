package scenarios;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import setup.BaseTest;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button")
    public void simpleNativeTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        //getPo().getWelement("signInBtn").click();
        //System.out.println("Simplest Android native test done");

        //getPo().getWelement("loginEmailField").sendKeys("rafael-rezyapov@mail.ru");
        //getPo().getWelement("login_pwdField").sendKeys("12345678qQ");
        //getPo().getWelement("signInBtn").click();

        //REgister New account
        getPo().getWelement("registerBtn").click();
        getPo().getWelement("eMailField").sendKeys("rafael-rezyapov@mail.ru");
        getPo().getWelement("usernameField").sendKeys("Rafael");
        getPo().getWelement("passwordField").sendKeys("12345678qQ");
        getPo().getWelement("passwordConfirmField").sendKeys("12345678qQ");
        getPo().getWelement("CheckedTextView").click();
        getPo().getWelement("registerNewAccountBtn").click();

        getPo().getWelement("loginEmailField").sendKeys("rafael-rezyapov@mail.ru");
        getPo().getWelement("login_pwdField").sendKeys("12345678qQ");
        getPo().getWelement("signInBtn").click();


    }

}
