package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract1 {
    WebDriver driver= new ChromeDriver();

    public void practice1() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement add=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        add.click();

        WebElement name=driver.findElement(By.id("firstname"));
        name.sendKeys("Harikrishna");

        WebElement lname=driver.findElement(By.id("lastname"));
        lname.sendKeys("M");

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("harikrishna@112.cd");

        WebElement age=driver.findElement(By.id("age"));
        age.sendKeys("2634");

        WebElement salary=driver.findElement(By.id("salary"));
        salary.sendKeys("30000000000000000000");

        WebElement dpt=driver.findElement(By.id("deparment"));
        dpt.sendKeys("development");

        WebElement sub=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
        sub.click();


        Thread.sleep(4000);

//        driver.close();

    }




    static void main() throws InterruptedException {
        Pract1 p=new Pract1();
        p.practice1();
    }
}
