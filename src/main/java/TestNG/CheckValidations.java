package TestNG;

import org.testng.annotations.*;

public class CheckValidations extends Validations{
    @BeforeTest
    public void testvalidation() {
        checkValid();
        System.out.println("Start method");
    }
    @AfterTest
    public void close(){
        System.out.println("Close method");
    }

   @Test
    public void print(){
        System.out.println("Hii");
    }
}
