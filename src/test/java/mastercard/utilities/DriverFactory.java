package mastercard.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import mastercard.utilities.DriverProvider;


public class DriverFactory
{

    private DriverFactory()
    {
    }
    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance()
    {
        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
    {
        @Override
        protected WebDriver initialValue()
        {
            return new DriverProvider().initialize("chrome");
        }
    };

    public WebDriver getDriver()
    {
        return driver.get();
    }

    public void removeDriver()
    {
        driver.get().quit();
        driver.remove();
    }
}
