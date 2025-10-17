package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract {
    WebDriver driver= new ChromeDriver();

    public void practice() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement name=driver.findElement(By.id("name"));
        name.sendKeys("Harikrishna");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("harikrishna@example.com");

        WebElement mobile = driver.findElement(By.id("mobile"));
        mobile.sendKeys("9876543210");

        WebElement subject = driver.findElement(By.id("subjects"));
        subject.sendKeys("Computer Science");

//        WebElement submit = driver.findElement(By.id("submit"));
//        submit.click();

        Thread.sleep(4000);

        driver.close();

    }

    static void main() throws InterruptedException {
        Pract p=new Pract();
        p.practice();
    }
}
