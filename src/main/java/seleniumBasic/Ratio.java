package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class Ratio extends Pract1 {
    public void ratio1(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        // relative xpath - //input[@value='igottwo']
        // absolute path - starts from html (html/body/main/div/div/div/form/div/input[@value='igottwo'])

        WebElement bnt=driver.findElement(By.xpath("//input[@value='igottwo']"));
        bnt.click();
    }
    public void ratio2() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(5000);
//        WebElement bnt1=driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input[@type='radio']"));
//        bnt1.click();

//        WebElement femaleRadio = driver.findElement(By.xpath("//label[contains(text(),'Female')]/preceding-sibling::input"));
//        femaleRadio.click();

        WebElement femaleRadio1 = driver.findElement(By.xpath("//div[label[normalize-space()='Female']/input[@type='radio']"));
        femaleRadio1.click();





        WebElement bnt2=driver.findElement(By.xpath("//label[text()='Sports']/preceding-sibling::input[@type='checkbox']"));
        bnt2.click();

    }
    //h1[contains(text(),'Registration ')]
    //label[text()='Name:']/parent::div/following-sibling::div/div/input[@id='email']
    static void main() throws InterruptedException {
        Ratio r=new Ratio();
        r.ratio2();
    }
}

