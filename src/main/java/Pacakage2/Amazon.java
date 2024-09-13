package Pacakage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        element.sendKeys("I phone 15 pro max");
        element.submit();
        driver.findElement(By.xpath("//img[@class=\"s-image\"]")).click();
        Set<String> handle = driver.getWindowHandles();
        for (String string : handle) {
            driver.switchTo().window(string);
        }
        driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\" and @type=\"submit\"]")).click();
        driver.findElement(By.xpath("//span[@id=\"attach-sidesheet-view-cart-button\"]")).click();


        WebElement webElement = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        webElement.sendKeys("Samsung s24 ultra");
        webElement.submit();
        driver.findElement(By.xpath("//img[@class=\"s-image\"]")).click();
        Set<String> Handle = driver.getWindowHandles();
        for (String string : Handle) {
            driver.switchTo().window(string);
        }
        driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\" and @type=\"submit\"]")).click();
        driver.findElement(By.xpath("//span[@id=\"attach-sidesheet-view-cart-button\"]")).click();


        WebElement phone = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        phone.sendKeys("I Phone 13");
        phone.submit();
        driver.findElement(By.xpath("//img[@class=\"s-image\"]")).click();
        Set<String> manage = driver.getWindowHandles();
        for (String string : manage) {
            driver.switchTo().window(string);
        }
        driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\" and @type=\"submit\"]")).click();
        driver.findElement(By.xpath("//span[@id=\"attach-sidesheet-view-cart-button\"]")).click();
//        driver.findElement(By.xpath("//span[@id=\"a-autoid-0\"]")).click();
//        driver.findElement(By.xpath("//a[@id=\"quantity_5\"]")).click();

    }
}
