package Ansul;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Calculator {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("appPackage", "com.miui.calculator");
        dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

//        dc.setCapability("deviceName","096a36f00408");
        dc.setCapability("deviceName", "096a36f00408");
        dc.setCapability("platformName", "Android");
//        dc.setCapability("platformVersion","12.0.3");
//        dc.setCapability("automationName","Appium");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("com.miui.calculator:id/btn_4_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_6_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
        WebElement result = driver.findElement(By.id("com.miui.calculator:id/result"));
        System.out.println(result.getText());
        String a = result.getText();
        a = a.replaceAll("= ", "");
        int b = Integer.parseInt(a);
        int i = 10;
        System.out.println(b + i);


    }
}
