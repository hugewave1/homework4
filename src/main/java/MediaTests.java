import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {
    String currentUrlMedia;
    String expectedUrlMedia = "https://romanceabroad.com/media/index";

    @Test
    public void testMediaPage (){
        driver.findElement(Locators.LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlMedia,expectedUrlMedia);
    }


}

