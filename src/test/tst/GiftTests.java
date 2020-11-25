package tst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftTests extends BaseUI {
    @Test
    public void Gifts() {

        driver.findElement(Locators.LINK_GIFTS).click();
        String currentUrlGifts = driver.getCurrentUrl();
        String giftsTitle = driver.getTitle();
        Assert.assertEquals(giftsTitle, "Pilot Group: Gift store - Categories");
        Assert.assertEquals(currentUrlGifts, "https://romanceabroad.com/store/category-sweets");
    }
}
