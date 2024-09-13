package TestNG;

import io.appium.java_client.touch.WaitOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataFromExcel {

    public static WaitOptions options;

    @Test(dataProvider="getdata")
    public void testdata(String username, String password){
        System.out.println(username+"-----"+password+"----");
    }



    }


