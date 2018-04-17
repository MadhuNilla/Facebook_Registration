import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

  public static WebDriver driver;
 @BeforeClass
 public static void openFB()
 {
     System.out.println("opening the browser facebook");
     System.setProperty("webdriver.chrome.driver","chromedriver");
     driver=new ChromeDriver();
// driver.get("http://www.facebook.com");
     driver.get("http://letskodeit.teachable.com/p/practice");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }
@AfterClass
    public static void closeFB()
{
    System.out.println("closing browser");
    driver.quit();
}
}
