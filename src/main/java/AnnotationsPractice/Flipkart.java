package AnnotationsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.time.Duration;

public class Flipkart {
    WebDriver driver;
@BeforeClass
         public void setup(){
        driver = new ChromeDriver();
        driver .manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test(priority = 1)
    public void searchbar(){
        System.out.println("Chrome driver is set");
        driver.get("https://www.flipkart.com");
        System.out.println("Flipkart title: "+driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("I phone 15");
        element.submit();
        System.out.println("Flipkart class"+driver.getTitle());
        driver.quit();

    }
@Test(priority = 2)
    public void main(){
        System.out.println("Flipkart run successfully!!!");
    }
@Test(priority = 3)
    public void main2(){
        System.out.println("Flipkart: E-commerce site");
    }

@AfterClass
    public void close(){
        System.out.println("Driver Close");
        driver.quit();
    }

}
