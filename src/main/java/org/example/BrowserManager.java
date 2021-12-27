package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage {
    LoadProp loadProp = new LoadProp();
    //copied variable from browserstack
    public static final String AUTOMATE_USERNAME = "mamtasuhagiya_O8p4sx";
    public static final String AUTOMATE_ACCESS_KEY = "y9wfq71TeQamrgV8sYPe";
    public static final String BrowseStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    DesiredCapabilities caps = new DesiredCapabilities();
    //variable created as purpose of select different browser to run the test case
    String browserName = "chrome";
    //browserName as run time perameter
    //public String browserName = System.getProperty("browser");
    //String browserName = System.getProperty("chrome");
    boolean cloud = false;
    boolean browserStackURL = Boolean.parseBoolean(System.getProperty("cloud"));

    public void openBrowser()
    {
        //making decision cloud true or false
        if (browserStackURL) {
            //this will  be run if cloud is true (in cloud)
            if (browserName.equalsIgnoreCase("chrome")) {

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            } else if (browserName.equalsIgnoreCase("edge")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "7");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "95.0");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            } else if (browserName.equalsIgnoreCase("firefox"))
            {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            }else
            {
                System.out.println("Wrong browser....!");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowseStackURL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else
            //this will be run if cloud false(locally)
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            } else {
                System.out.println("Your browser name is wrong");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(loadProp.getProperty("url"));
        }

        public void closeBrowser()
    {
            driver.close();

        }
    }

