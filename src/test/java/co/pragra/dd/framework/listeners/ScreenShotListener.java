package co.pragra.dd.framework.listeners;

import co.pragra.dd.framework.drivermanger.DriverManager;
import co.pragra.dd.framework.utils.CommonUtils;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ScreenShotListener extends TestListenerAdapter {
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        super.onTestSuccess(iTestResult);
        WebDriver driver =DriverManager.getDriverInstance();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String successFile=CommonUtils.getFileName(iTestResult.getName(),true);
        File file =new File(successFile);

        try {
            Files.copy(screenshot,file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        super.onTestFailure(iTestResult);
        WebDriver driver = DriverManager.getDriverInstance();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String diskFile = CommonUtils.getFileName(iTestResult.getName(), false);
        File file = new File(diskFile);
        try {
            // Using  com.google.common.io.Files
            Files.copy(screenshot,file);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
