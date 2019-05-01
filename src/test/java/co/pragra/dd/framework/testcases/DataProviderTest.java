package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.data.ResigterDataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


    @Test(dataProvider = "userpass", dataProviderClass = ResigterDataProvider.class)
    public void dummyLoginTC(String username, String pass) {
        System.out.println("Doing login using username -> " + username + "  Password --> " + pass);
    }

    @Test(dataProvider = "resetUser", dataProviderClass = ResigterDataProvider.class)
    public void resetPassTest(String user) {
        System.out.println("Resettting password for the user --> " + user);
    }

    @Test(dataProvider = "mixDataProvider", dataProviderClass = ResigterDataProvider.class)
    public void anotherTest(String a, String b, double balance) {
        System.out.println("Value of a ---> " + a);
        System.out.println("Value of b ---> " + b);
        System.out.println("Value of balance ---> " + balance);
    }


    @Test(dataProvider = "modifiedRegisterDataP", dataProviderClass = ResigterDataProvider.class)
    public void registerTest(String name, String address, String age) {
        System.out.println("Name is --> " + name);
        System.out.println("Address is --> " + address);
        System.out.println("Age is --> " + age);
    }


}
