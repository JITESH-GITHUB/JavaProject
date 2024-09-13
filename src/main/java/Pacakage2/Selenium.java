package Pacakage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Selenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Gurugram Universty");
        element.submit();
        driver.findElement(By.xpath("//h3[text()='Gurugram University']")).click();
        driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"btn-close\"]")).click();
        driver.findElement(By.xpath("//a[@title=\"Student Login\"]")).click();
        Set<String> handle = driver.getWindowHandles();
//        Iterator<String> itr = handle.iterator();
//        String parentwindow = itr.next();
//        String Secondwindow = itr.next();
        for (String string : handle) {
            System.out.println("Title" + handle);
            driver.switchTo().window(string);
        }
        //  driver.switchTo().window(Secondwindow);
        driver.findElement(By.xpath("//input[@placeholder=\"Username / URN\"]")).sendKeys("201270330422");
        driver.findElement(By.xpath("//input[@title=\"Password\"]")).sendKeys("Jitesh@123");
        String Title = driver.getTitle();
        System.out.println(Title);

//        driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
//        driver.findElement(By.xpath("//span[text()='Place Order']")).click();


    }
}
