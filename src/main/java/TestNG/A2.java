package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.ServerSocket;

public class A2 extends A1{
    @BeforeTest
    public void Test(){
        System.out.println("This is Before Test");
        System.out.println("jitu");
    }
    @AfterTest
    public void Test1(){
        System.out.println("This is After Test");
    }

    }

