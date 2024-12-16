package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage{


    private final By showsBox =By.name("theater-and-performing-arts");
    private final By experienceBox=By.name("experience");
    private final By activitiesBox=By.xpath("//*[text()='Activities & Adventures']");
    private final By checkMovie =By.xpath("//*[text()='Moshira Al Khatira']");



public void setShowsBox(){
    driver.navigate().refresh();
    clickElement(showsBox);
}
    public void setExperienceBox(){
    waitForVisibility(experienceBox);
        clickElement(experienceBox);
    }
    public void setActivitiesBoz(){
    waitForVisibility(activitiesBox);
    clickElement(activitiesBox);
    }

    public String movieName(){
    waitForVisibility(checkMovie);
    return getText(checkMovie);
    }


    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
