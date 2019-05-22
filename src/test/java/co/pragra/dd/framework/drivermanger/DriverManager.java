package co.pragra.dd.framework.drivermanger;

import co.pragra.dd.framework.config.AppConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.LoggerFactory;

public class DriverManager {
    private static WebDriver driver;
    private static Logger logger = LogManager.getLogger(DriverManager.class);

    private DriverManager(){

    }
    private static void initDriver(){
        logger.log(Level.INFO,"Initializing the webdriver with browserType {} ", AppConfig.getProperty("browser"));
        if(AppConfig.getProperty("browser").equals(BrowserType.CHROME)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else
        if(AppConfig.getProperty("browser").equals(BrowserType.FIREFOX)){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else
        if(AppConfig.getProperty("browser").equals(BrowserType.INTERNET_EXPLORER)){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }else
        if(AppConfig.getProperty("browser").equals(BrowserType.OPERA)){
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }else
        if(AppConfig.getProperty("browser").equals(BrowserType.SAFARI)){
            driver = new SafariDriver();
        }else {
            logger.log(Level.WARN,"Check brower in config file, defaulting it to CHROME");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

    }

    public static WebDriver getDriverInstance(){
        if(driver==null){
            initDriver();
        }
        return driver;
    }

}
