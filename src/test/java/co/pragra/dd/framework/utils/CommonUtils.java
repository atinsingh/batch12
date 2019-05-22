package co.pragra.dd.framework.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {

    public static String screenShotDirName;
    static Logger logger = LogManager.getLogger(CommonUtils.class);

    public static void createScreenShotDirectories(){


        screenShotDirName = getTimeStamp();
        logger.log(Level.INFO, "Creating screenshot direcotories {} ", screenShotDirName);
        Path path = Paths.get("screenshot", screenShotDirName);

        try {
            Files.createDirectories(path);
            Files.createDirectories(Paths.get(path.toString(),"pass"));
            Files.createDirectories(Paths.get(path.toString(),"fail"));
        }catch (IOException ex){
           logger.log(Level.ERROR,"Error in creating directory msg {}", ex.getMessage());
        }
    }

    public static String getFileName(String testName, boolean pass){
        createScreenShotDirectories();
        if(pass) {
            return Paths.get("screenshot",screenShotDirName,"pass", testName+".png").toString();
        }
        return Paths.get("screenshot",screenShotDirName,"fail", testName+".png").toString();
    }

    /**
     * This method will create a folder name reports on the project root
     * and will create a file name like report_21052019228281.html
     * @return
     */
    public static String getReportFileName(){
        Path path = Paths.get("reports");
        try {
            Files.createDirectories(path);
        }catch (IOException ex){
            logger.log(Level.ERROR,"Error in creating directory msg {}", ex.getMessage());
        }
        return path.toString()+"/report_"+getTimeStamp()+".html";
    }

    private static String getTimeStamp(){
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
        String timestamp = format.format(new Date());
        return timestamp;
    }
}
