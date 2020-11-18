import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork4 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod (){
        System.setProperty("webdriver.chrome.driver", "/Users/family/Desktop/homework4/homework4/chromedriver");
        driver = new ChromeDriver();
        driver.manage(). window().maximize();
        driver.get("https://romanceabroad.com/");
    }

    @Test
    public void prettyWomen (){
        By LINK_WOMEN = By.xpath("//a[@href=\"https://romanceabroad.com/users/search\"]");
        WebElement element = driver.findElement(LINK_WOMEN);
        element.click();
        String currentUrlPrettyWomen = driver.getCurrentUrl();
        String prettyWomenTitle = driver.getTitle();
        System.out.println(prettyWomenTitle);
        Assert.assertEquals(prettyWomenTitle, "https://romanceabroad.com/users/search");
        Assert.assertEquals(currentUrlPrettyWomen, "https://romanceabroad.com/users/search");

    }

    @Test
    public void testRegistration(){
        By LINK_REGISTRATION = By.xpath("//button[@id=\"show-registration-block\"]");
        WebElement element = driver.findElement(LINK_REGISTRATION);
        element.click();
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("123@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Aigerim");
        driver.findElement(By.xpath("//button[text()=\"Next\"][@type=\"button\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"nickname\"]")).sendKeys("Imanbayeva");
        driver.findElement(By.xpath("//input[@type=\"text\"][@name=\"data[phone]\"]")).sendKeys("4254653395");

    }
    @AfterMethod
    public void AfterMethod (){
        driver.quit();
    }
}

