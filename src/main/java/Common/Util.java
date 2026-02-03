package Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Util {
    static WebDriver driver;
    public static WebDriver launchBrowser(String browserName)
    {
        if (browserName.equalsIgnoreCase("Chrome"))
        {   driver=new ChromeDriver();}
        else if(browserName.equalsIgnoreCase("Edge"))
        { driver=new EdgeDriver();}
        else if(browserName.equalsIgnoreCase("Firefox")){
            driver=new FirefoxDriver();}
        else {
            driver = null;
        }
        return driver;
    }
    public static void getUrl(String url, long time)
    { driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

    }
    public static void setImplicit(long time)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
    public static void maximizeWindow()
    {
        driver.manage().window().maximize();
    }
    public static void closeWindow()
    {
        driver.close();
    }

}








