package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class trainer {
    WebDriver driver = new ChromeDriver();

    public void test() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement name = driver.findElement(By.name("email"));
        name.sendKeys("hari");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("hari123");

        WebElement newUs = driver.findElement(By.linkText("New User"));
        newUs.click();

      Thread.sleep(4000);
        WebElement fstName1 = driver.findElement(By.id("firstname"));
        fstName1.sendKeys("hari");

        WebElement lstName1 = driver.findElement(By.id("lastname"));
        lstName1.sendKeys("M");

        WebElement urName1 = driver.findElement(By.id("username"));
        urName1.sendKeys("hariM231");

        WebElement regPass1 = driver.findElement(By.id("password"));
        regPass1.sendKeys("123");

        WebElement blgn = driver.findElement(By.linkText("Back to Login"));
        blgn.click();

//        driver.close();

    }

    static void main() throws InterruptedException {
        trainer t=new trainer();
        t.test();
    }
}
