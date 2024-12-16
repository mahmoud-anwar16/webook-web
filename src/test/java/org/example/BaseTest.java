package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    @BeforeClass
    public void lunchBrowser(){
        driver=new ChromeDriver();
        driver.navigate().to("https://webook.com/en");
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
