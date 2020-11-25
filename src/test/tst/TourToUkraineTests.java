package tst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkraineTests extends BaseUI {
    @Test
    public void TourToUkraine() {
        driver.findElement(Locators.LINK_TOUR).click();
        String currentUrlTourToUkraine = driver.getCurrentUrl();
        String tourTitle = driver.getTitle();
        Assert.assertEquals(tourTitle, "Pilot Group: Gift store - Item");
        Assert.assertEquals(currentUrlTourToUkraine, "https://romanceabroad.com/store/sweets/20-tour_to_ukraine");
    }
}