package tst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrettyWomenTests extends BaseUI {

    @Test
    public void PrettyWomen() {
       driver.findElement (Locators.LINK_WOMEN).click();
        String currentUrlPrettyWomen = driver.getCurrentUrl();
        String prettyWomenTitle = driver.getTitle();
        Assert.assertEquals(prettyWomenTitle, "Meet single Ukrainian women online: dating and marriage at Marry Ukrainian Lady");
        Assert.assertEquals(currentUrlPrettyWomen,"https://romanceabroad.com/users/search");
    }
}

