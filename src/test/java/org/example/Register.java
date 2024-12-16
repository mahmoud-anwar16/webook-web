package org.example;

import org.testng.annotations.Test;
import java.io.IOException;

public class Register extends BaseTest {

    @Test
    public void userRegister() throws IOException {
        HomePage homePage = new HomePage(driver);
        RegistrationPage register = new RegistrationPage(driver);
        homePage.handleBrowserAlerts();

        homePage.clickSignUp();
        homePage.clickCreateAccount();
        register.enterFirstName(new Json().getValue("src/main/resources/data.json", "FirstName"));
        register.enterLastName(new Json().getValue("src/main/resources/data.json", "LastName"));
        register.setEmail(new Json().getValue("src/main/resources/data.json", "Email"));
        register.setConfirmEmail(new Json().getValue("src/main/resources/data.json", "Email"));
        register.setPassword(new Json().getValue("src/main/resources/data.json", "password"));
        register.setMobileNum(new Json().getValue("src/main/resources/data.json", "MobileNumber"));
        register.setCheckBox();
        register.clickCreateAccountBTN();
        homePage.openProfile();
        homePage.logout();
    }
}
