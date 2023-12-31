package com.library.cv.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/library/cv",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}

)
public class TestRunner
{

//    @AfterClass
//    public static void setUp() {
//        String projectPath = System.getProperty("user.dir");
//        String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
//        //Reporter.loadXMLConfig(reportConfigPath);
//        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
//        Reporter.setSystemInfo("Selenium", "3.141.59");
//        Reporter.setSystemInfo("Maven", "3.5.9");
//        Reporter.setSystemInfo("Java Version", "1.8.0_151");
//    }
}
