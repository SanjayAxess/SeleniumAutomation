//package Appium;
//
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class mobileChrome {
//    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("PLATFORM_NAME", "Android");
//        caps.setCapability("DEVICE_NAME", "sdk_gphone64_x86_64");
//        caps.setCapability("AUTOMATION_NAME", "UiAutomator2");
//        caps.setCapability("BROWSER_NAME", "Chrome");
//
//        // ✅ Use RemoteWebElement or no generic
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//
//        driver.get("https://www.google.com");
//        Thread.sleep(3000);
//
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("Appium latest Chrome automation 2025");
//        searchBox.submit();
//
//        Thread.sleep(5000);
//        System.out.println("Page Title: " + driver.getTitle());
//
//        driver.quit();
//    }
//}
