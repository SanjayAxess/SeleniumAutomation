package AmazonBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class amazon {
    WebDriver driver=new ChromeDriver();
    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public void tabs(int t){
        Set<String> windows = driver.getWindowHandles();
        int i = 1;
        for (String w : windows) {
            if (i == t) {
                driver.switchTo().window(w);
                break;
            }
            i++;
        }
    }
    public void amazonsite() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        try {
            WebElement continueBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//input[@type='submit']")
            ));
            if (continueBtn.isDisplayed()) {
                continueBtn.click();
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("No Continue shopping screen.");
        }

        WebElement sch= driver.findElement(By.xpath("//label[normalize-space(text()=Search)]/following-sibling::input[@type='text']"));
        sch.sendKeys("amazon kindle");

        Thread.sleep(2000);

        WebElement schbt= driver.findElement(By.id("nav-search-submit-button"));
        schbt.click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'All-new Amazon Kindle Paperwhite (16 GB)')]"));
        actions.moveToElement(element).moveByOffset(-100, 0).perform();

        Thread.sleep(2000);

        WebElement ebook=driver.findElement(By.xpath("//span[contains(normalize-space(text()), 'All-new Amazon Kindle Paperwhite (16 GB)')]"));
        ebook.click();

        tabs(2); // switch to second tab
        Thread.sleep(2000);

        WebElement buy = driver.findElement(By.id("buy-now-button"));
        buy.click();


    }

    static void main() throws InterruptedException {
        amazon a= new amazon();
        a.amazonsite();
    }

}
