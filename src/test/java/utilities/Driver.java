package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
public class Driver {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    //Handle with SSL certificates
                    // Desired capabilites
                    // general chrome profiles
                    DesiredCapabilities desiredCapabilities  = DesiredCapabilities.chrome();
                    desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
                    desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
                    // Below for your local browser
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.merge(desiredCapabilities);
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class);
                    driver = new SafariDriver();
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void closeDriver(){
        if (driver != null) {
            driver.close();
            driver=null;
        }
    }
}