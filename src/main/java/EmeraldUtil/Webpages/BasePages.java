package EmeraldUtil.Webpages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePages {

  public static String baseUrl = "https://www.emerald.com/insight/search?q=marketing";
  public static WebDriver driver;
  public static WebDriverWait driverWait;
  public static String browserType = "chrome";


  public static void startBrowser(String browser){

    if(browser.equalsIgnoreCase("chrome")){

      WebDriverManager.chromedriver().setup();
      //ChromeOptions chromeOptions = new ChromeOptions();
      //chromeOptions.addArguments("--incognito");
      driver = new ChromeDriver();
    }

    else if(browser.equalsIgnoreCase("firefox")){
      WebDriverManager.firefoxdriver().setup();
      FirefoxOptions firefoxOptions = new FirefoxOptions();
      firefoxOptions.addArguments("--incognito");
      driver = new FirefoxDriver(firefoxOptions);
    }
    driver.manage().window().maximize();

  }
  public void exit(){

    driver.quit();
  }




}
