package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A4 extends A3 {

    @BeforeMethod
    public void Method(){
        System.out.println("This is Before Method");
    }
    @Test
    public void Dhillon(){
        System.out.println("Dhilon");
    }
    @AfterMethod
    public void Method1() {
        System.out.println("This is After Method");
    }
}
