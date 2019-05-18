package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.config.AppConfig;
import org.testng.annotations.Test;

public class ConfigTest {

    @Test
    public void testProperty(){

        if(AppConfig.getProperty("browser").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrrome.driver", AppConfig.getProperty("chromedriverexe"));

        }if(AppConfig.getProperty("browser").equalsIgnoreCase("fireforx")){
            System.setProperty("webdriver.chrrome.driver", AppConfig.getProperty("firefoxexe"));
        }
    }
}
