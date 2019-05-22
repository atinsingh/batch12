package co.pragra.dd.framework.reports;

import co.pragra.dd.framework.utils.CommonUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HTMLReport {
    private ExtentHtmlReporter htmlReporter;
    private ExtentReports reports;
    private static HTMLReport report;

    public HTMLReport(){
        htmlReporter = new ExtentHtmlReporter(CommonUtils.getReportFileName());
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);
    }

    public static HTMLReport getInstance(){
        if(report==null){
            report = new HTMLReport();
        }
        return report;
    }

    public ExtentReports getReports() {
        return reports;
    }
}
