package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.annotation.Tainted;

public class A1 {
    @BeforeSuite
    public void suite(){
        System.out.println("This is Before Suite");
        System.out.println("Dhillon");
    }
    @Test
    public void Vikash(){
        System.out.println("Vikash");
    }
    @AfterSuite
    public void Suite1(){
        System.out.println("This is After Suite");
    }
}
