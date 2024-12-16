package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{

    private final By firstName= By.id("first_name");
    private final By lastName= By.id("last_name");
    private final By email= By.id("email");
    private final By confirmEmail= By.id("confirm_email");
    private final By password=By.name("password");
    private final By mobileNum=By.name("mobile");
    private final By checkBox=By.xpath("//input[@name='agreeTerms']");
    private final By createAccountBTN = By.xpath("//button[@type='submit']");


    public void enterFirstName(String fName) {
        waitForVisibility(this.firstName);
        sendKeys(this.firstName, fName);
    }
    public void enterLastName(String LName) {
        waitForVisibility(this.lastName);
        sendKeys(this.lastName, LName);
    }

    public void setEmail(String Email) {
        waitForVisibility(this.email);
        sendKeys(this.email,Email );
    }

    public void setConfirmEmail(String CEmail) {
        waitForVisibility(confirmEmail);
        sendKeys(confirmEmail, CEmail);
    }

    public void setPassword(String pass) {
        waitForVisibility(this.password);
        sendKeys(this.password, pass);
    }
    public void setMobileNum(String num) {
        waitForVisibility(mobileNum);
        sendKeys(mobileNum, num);
    }

    public void setCheckBox() {

        clickElement(checkBox);
    }
    public void clickCreateAccountBTN() {
        waitForVisibility(createAccountBTN);
        clickElement(createAccountBTN);
    }




    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


}
