package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.config.AppConfig;
import org.testng.annotations.Test;

public class ConfigTest {

    @Test
    public void testProperty(){
        System.out.println(System.getenv().get("USER"));
    }
}
