package co.pragra.dd.framework.data;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResigterDataProvider {
    @DataProvider
    public static Iterator<Object[]> modifiedRegisterDataP() {
        List<Object[]> data = new ArrayList<>();
        Path path = Paths.get("testdata", "data.csv");
        try {
            List<String> strings = Files.readAllLines(path);
            for (String str : strings) {
                String[] csvData = str.split(",");
                data.add(csvData);
            }

        } catch (IOException ex) {

        }
        return data.iterator();
    }


    @DataProvider
    public static Object[][] registerDataP() {
        Path path = Paths.get("testdata", "data.csv");
        Object[][] data = new Object[3][3];
        try {
            List<String> lines = Files.readAllLines(path);

            for (int i = 0; i < lines.size(); i++) {
                String[] split = lines.get(i).split(",");
                data[i] = split;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;

    }


    @DataProvider
    public static Object[][] mixDataProvider() {

        return new Object[][]{{"atin", "singh", 2.0}};

    }


    @DataProvider
    public static Object[][] resetUser() {
        Object[][] users = new Object[2][2];
        users[0][0] = "atin";
        users[0][1] = "singh";
        users[1][0] = "vivek";
        users[1][1] = "Ghartan";
        return users;

    }


    @DataProvider(name = "userpass")
    public static Object[][] userPassProvider() {
        return new String[][]{{"vivek", "2737463"}, {"atin", "27237"}};

    }

}
