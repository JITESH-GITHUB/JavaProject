package AnnotationsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class Mesho {
    WebDriver driver;
    @BeforeSuite
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        System.out.println("Mesho");
    }
    @BeforeTest
    public void navigation(){
        driver.get("https://blinkit.com/");
        System.out.println(driver.getTitle());
    }
    @BeforeClass
    public void click(){
        driver.findElement(By.xpath("//button[text()=\"Detect my location\"]")).click();
        System.out.println("Blinkit class");
    }
    @Test
    public void main(){
        System.out.println("Meesho open !!!");
    }
    @AfterSuite
    public void close(){
        driver.quit();
    }
}
