package co.pragra.dd.framework.testcases;

import co.pragra.dd.framework.utils.CommonUtils;
import org.testng.annotations.Test;

public class UtilTest {

    @Test
    public void test(){
        CommonUtils.createScreenShotDirectories();
    }

}
