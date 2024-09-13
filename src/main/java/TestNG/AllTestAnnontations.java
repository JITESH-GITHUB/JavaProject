package TestNG;

import org.testng.annotations.*;

public class AllTestAnnontations extends A4 {

    @Test
    public void test(){
        System.out.println("This is test");
    }
    @BeforeClass
    public void ansul(){
        System.out.println("Ansul");
    }
}
