package Pacakage2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class SarkariResult {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.google.com");
        //   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("sarkari result.com");
        element.submit();
        System.out.println("Title is : " + driver.getTitle());
        driver.findElement(By.xpath("//h3[contains(text(),'SarkariResult.com')]")).click();
        WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Supreme Court')]"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(element1).build().perform();
        Thread.sleep(5000);
        element1.click();
        Set<String> handle = driver.getWindowHandles();
        for (String string : handle) {
            driver.switchTo().window(string);
        }
        System.out.println("WindowIDs : " + handle);
        WebElement store = driver.findElement(By.xpath("//a[@title=\"Registration for SCI Junior Court Attendant Exam Registration 2024\"]"));
        js.executeScript("arguments[0].scrollIntoView();", store);
        Thread.sleep(5000);
        store.click();
        Set<String> webElements = driver.getWindowHandles();
        for (String s : webElements) {
            driver.switchTo().window(s);
        }
        driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
        Set<String> str = driver.getWindowHandles();
        for (String stt : str){
            driver.switchTo().window(stt);
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(3000);
        Set<String> st = driver.getWindowHandles();
        for (String strong : st){
            driver.switchTo().window(strong);
        }
        driver.findElement(By.xpath("//input[@placeholder=\"Enter User ID\"]")).sendKeys("JITESH RAO");
    }
}
