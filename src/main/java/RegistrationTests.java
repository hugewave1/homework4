import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testRegistration(){
        driver.findElement(Locators.LINK_REGISTRATION).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aigerim");
        driver.findElement(By.xpath("//button[text()='Next'][@type='button']")).click();
        driver.findElement(By.xpath("//input[@id='nickname']")).sendKeys("Imanbayeva");
        driver.findElement(By.xpath("//input[@type='text'][@name='data[phone]']")).sendKeys("4254653395");

    }

}

