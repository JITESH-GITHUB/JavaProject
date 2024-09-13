package TestNG;

import org.testng.annotations.*;

public class TestBeforeMethod {
    @BeforeMethod
    public void openBrowser (){
        System.out.println("Opening Browser !!!");
    }
    @AfterMethod
    public void closebrowser (){
        System.out.println("Browser close Successfully !!!");
    }
    @Test(priority = 1)
    public void userReg (){
        System.out.println("Registration Successfully !!!");
    }
    @Test(priority = 2)
    public void login (){
        System.out.println("Login Successfully !!!");
    }
}
