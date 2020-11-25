package tst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI {
    @Test
    public void Blog() {
        driver.findElement(Locators.LINK_BLOG).click();
        String currentUrlBlog = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlBlog, "https://romanceabroad.com/content/view/blog");
    }
}