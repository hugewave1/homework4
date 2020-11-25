package tst;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotosTests extends BaseUI  {
    @Test
    public void Photos () {

        By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
        driver.findElement(Locators.LINK_PHOTOS).click();
        String currentUrlPhotos = driver.getCurrentUrl();
        String photosTitle = driver.getTitle();
        Assert.assertEquals(photosTitle, "Ukrainian women photos: ladies pictures at Marry Ukrainian Lady");
        Assert.assertEquals(currentUrlPhotos, "https://romanceabroad.com/media/index");
    }
}
