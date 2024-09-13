package TestngListeners;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProvider extends BaseTest{
    @Test(dataProvider = "dp")
    public void doLogin(String email, String password) throws InterruptedException {
        driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
        driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
        boolean checkstatus;
        try {
            driver.findElement(By.xpath("//h2[text()='My Account']"));
            checkstatus=true;
        }catch (Exception e){
            checkstatus=false;
        }

       if (checkstatus){
           System.out.println("Login Successfully");
           Assert.assertTrue(true);
           driver.findElement(By.xpath("//div[@class=\"list-group\"]//child::a [text()=\"Logout\"]")).click();
           driver.findElement(By.xpath("//a[@class=\"list-group-item\"][text()='Login']")).click();

       }else {

           driver.findElement(By.xpath("//a[@class=\"list-group-item\"][text()='Login']")).click();
           System.out.println("Fail");
              Assert.fail();
       }

    }
    @org.testng.annotations.DataProvider(name="dp",indices ={0,2})  //indices means only which index no. data i want to provide
    Object[][] logindata(){
        Object data[][]={
                {"trainer@way2automation.com","ABcd@1345"},
                {"yjitesh122504@gmail.com","ABcd@123456"},
                {"pavanol123@gmail.com","test@123"},
                {"Way2automation@gmail.com","test@1234567"},
                {"pavanol123@gmail.com","test@123"}
        };
        return data;
    }

}
