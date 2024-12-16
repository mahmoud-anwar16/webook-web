package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private static final long WAIT = 20;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement waitForVisibility(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    protected void sendKeys(By by, String e) {
        driver.findElement(by).sendKeys(e);
    }

    protected void clickElement(By by) {
        driver.findElement(by).click();
    }

    protected String getText(By locator) {
        WebElement element = waitForVisibility(locator);
        return element.getText();
    }

    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }


    public boolean isElementVisible(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void selectByIndex(By locator, int index) {
        WebElement dropdownElement = driver.findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
    }

    public void switchToNewTab() {
        String originalWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }


}

