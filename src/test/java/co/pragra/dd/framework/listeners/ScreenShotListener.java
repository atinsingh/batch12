package co.pragra.dd.framework.listeners;

import co.pragra.dd.framework.drivermanger.DriverManager;
import co.pragra.dd.framework.reports.HTMLReport;
import co.pragra.dd.framework.utils.CommonUtils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
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

    ExtentTest test ;

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        test = HTMLReport.getInstance().getReports().createTest(iTestResult.getName());

        super.onTestSuccess(iTestResult);
        WebDriver driver =DriverManager.getDriverInstance();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String successFile=CommonUtils.getFileName(iTestResult.getName(),true);
        File file =new File(successFile);
        test.log(Status.PASS,"Test Passed");

        try {
            Files.copy(screenshot,file);
            test.log(Status.INFO, "Generated Screenshot file "+ file.getAbsolutePath());
            test.addScreenCaptureFromPath(file.getAbsolutePath(),"Contact Test Screenshot");
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
