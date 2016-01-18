package AppointmentBooking;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
public static WebDriver driver;
 public static WebDriver getDriver(){
	 if ("Chrome".equals(Constant.Browser)){
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			   driver= new ChromeDriver();
	 }
	             else{
               driver = new FirefoxDriver();
                }
	            return driver;
      }

}