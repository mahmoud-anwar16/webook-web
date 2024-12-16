package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class UserSearch extends BaseTest {

    @Test
    public void search() throws IOException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        homePage.handleBrowserAlerts();


        homePage.setSearch(new Json().getValue("src/main/resources/data.json", "search"));
        homePage.clickSearch();

        searchPage.setShowsBox();
        searchPage.setExperienceBox();
        searchPage.setActivitiesBoz();
        Assert.assertEquals(searchPage.movieName(), new Json().getValue("src/main/resources/data.json", "moviename"));
    }
}
