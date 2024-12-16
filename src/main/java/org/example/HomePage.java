package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By signUp=By.xpath("//*[@class='relative shrink-0 text-sm']");

    private final By createAccount=By.xpath ("//*[text()='Create an account']");
    private final By search=By.xpath("//*[@type='search']");
    private final By searchBtn=By.xpath("//button[@data-testid='home_search_submit_button']");
    private final By filter=By.xpath("//*[@class='xs:inline hidden']");
    private final By profileBtn=By.xpath("//*[@class=\"relative shrink-0 text-sm\"]");
   private final By LogoutBtn=By.xpath("//*[text()='Logout']");

    public void handleBrowserAlerts() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement rejectCookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Reject\"]")));
            rejectCookiesButton.click();
        } catch (TimeoutException e) {
            System.out.println("No cookie alert displayed.");
        }
    }



    public void clickSignUp() {
        waitForVisibility(signUp);
        clickElement(signUp);
    }
    public void clickCreateAccount(){
        waitForVisibility(createAccount);
        clickElement(createAccount);
    }
    public void setSearch(String e){
        waitForVisibility(search);
        sendKeys(search,e);
    }
    public void clickSearch(){
        clickElement(searchBtn);
    }
    public void clickFilters(){
        clickElement(filter);
    }

    public void openProfile(){
        waitForVisibility(profileBtn);
        clickElement(profileBtn);
    }
    public String logout(){
        return getText(LogoutBtn);
    }





}


