package Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TC_Keyboard_Wd {
/*	static String  url     = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";*/

	public static void main(String[] args) throws Exception
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.google.com/");
       Thread.sleep(3000);
       driver.findElement(By.name("q")).sendKeys("selenium");
       Thread.sleep(3000);
       driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(3000);
       driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
       driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
       Thread.sleep(30000);
       driver.close();
		

	}

}
