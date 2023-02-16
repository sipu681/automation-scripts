package Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchBrowser 
{

	public static void main(String[] args) throws Exception
	{
   System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   Thread.sleep(4000);
   driver.close();
   
	}

}
