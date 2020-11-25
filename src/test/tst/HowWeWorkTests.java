package tst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {

    @Test
    public void HowWeWork() {
        driver.findElement(Locators.LINK_WORK).click();
        String currentUrlHowWeWork = driver.getCurrentUrl();
        String howWeWorkTitle = driver.getTitle();
        Assert.assertEquals(howWeWorkTitle,"Real Ukrainian women for marriage: legitimate dating site Marry Ukrainian Lady");
        Assert.assertEquals(currentUrlHowWeWork,"https://romanceabroad.com/content/view/how-it-works");
    }

}

