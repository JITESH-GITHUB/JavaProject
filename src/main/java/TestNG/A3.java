package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A3 extends A2 {

    @BeforeClass
    public void Class(){
//System.out.println("This is Before Class");
    }
    @AfterClass
    public void Class1() {
        System.out.println("This is After Class");
    }

}
