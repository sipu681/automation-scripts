package Examples;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandeling 
{

	public static void main(String[] args) throws Exception
	{
		  System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.navigate().to("E:\\java\\window.html");
	        Thread.sleep(3000);
	        driver.findElement(By.id("btn2")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("btn3")).click();
	        Thread.sleep(3000);
	        ArrayList<String>windinfo = new ArrayList<>(driver.getWindowHandles());
             driver.switchTo().window(windinfo.get(0));
             Thread.sleep(4000);
             driver.quit();
	}

}
