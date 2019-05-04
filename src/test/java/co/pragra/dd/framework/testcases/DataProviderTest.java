package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.data.ExcelDataProvider;
import co.pragra.dd.framework.data.FilloBasedProvider;
import co.pragra.dd.framework.data.ResigterDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderTest {


    @Test(dataProviderClass = ExcelDataProvider.class, dataProvider = "excelDP")
    public void excelDPtest(Object name1, Object name2, Object name3, Object name4){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }


    @Test(dataProvider = "filloProvider", dataProviderClass = FilloBasedProvider.class)
    public void filloTest(String user, String pass){
        System.out.println(user);
        System.out.println(pass);
    }

//    @Test(dataProvider = "userpass", dataProviderClass = ResigterDataProvider.class)
//    public void dummyLoginTC(String username, String pass) {
//        System.out.println("Doing login using username -> " + username + "  Password --> " + pass);
//    }
//
//    @Test(dataProvider = "resetUser", dataProviderClass = ResigterDataProvider.class)
//    public void resetPassTest(String user) {
//        System.out.println("Resettting password for the user --> " + user);
//    }
//
//    @Test(dataProvider = "mixDataProvider", dataProviderClass = ResigterDataProvider.class)
//    public void anotherTest(String a, String b, double balance) {
//        System.out.println("Value of a ---> " + a);
//        System.out.println("Value of b ---> " + b);
//        System.out.println("Value of balance ---> " + balance);
//    }
//
//
//    @Test(dataProvider = "modifiedRegisterDataP", dataProviderClass = ResigterDataProvider.class)
//    public void registerTest(String name, String address, String age) {
//        System.out.println("Name is --> " + name);
//        System.out.println("Address is --> " + address);
//        System.out.println("Age is --> " + age);
//    }


}
