package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumB {
    WebDriver driver=new ChromeDriver();

     public void chrome() throws InterruptedException {
       driver.get("https://www.facebook.com/login/");
       driver.manage().window().maximize();
       //waits - > implicit , Explicit, Thread.sleep
         Thread.sleep(5000);
        WebElement email =  driver.findElement(By.id("email"));
        email.sendKeys("HariKrish");
        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("hari123");

       WebElement loBtn = driver.findElement(By.id("loginbutton"));
       loBtn.click();
       Thread.sleep(5000);

       driver.navigate().back();

       Thread.sleep(4000);

       WebElement pass1 = driver.findElement(By.name("pass"));
       pass1.sendKeys("hari123");

       WebElement forBtn= driver.findElement(By.linkText("Forgotten account?"));
       forBtn.click();

       WebElement idfEmail =  driver.findElement(By.id("identify_email"));
       idfEmail.sendKeys("9999994444");

       WebElement didSubmit = driver.findElement(By.id("did_submit"));
       didSubmit.click();

       driver.navigate().back();

       Thread.sleep(5000);

       WebElement signUp= driver.findElement(By.linkText("Sign up for Facebook"));
       signUp.click();

       WebElement fstName = driver.findElement(By.name("firstname"));
       fstName.sendKeys("hari");

      WebElement lstName = driver.findElement(By.name("lastname"));
      lstName.sendKeys("M");

      WebElement regMail = driver.findElement(By.name("reg_email__"));
      regMail.sendKeys("hari");

      WebElement regPass = driver.findElement(By.name("reg_passwd__"));
      regPass.sendKeys("hari");

      WebElement wesubmit= driver.findElement(By.name("websubmit"));
      wesubmit.click();

//       WebElement notBtn= driver.findElement(By.linkText("Cancel"));
//       notBtn.click();


//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    Thread.sleep(5000);
       driver.close();


     }

    static void main() throws InterruptedException {
        seleniumB vd=new seleniumB();
        vd.chrome();
    }
}
