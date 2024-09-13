package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validations {

    public void checkValid(){
        String a ="jitesh";
        String b = "jitesh";
        System.out.println(a);
        System.out.println(b);
       Assert.assertEquals(a,b);
        System.out.println("Test Pass");
    }
}
