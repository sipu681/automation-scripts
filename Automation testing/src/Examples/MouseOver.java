package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class MouseOver 
{
	static String  url     = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 Thread.sleep(3000);
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouse over is completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked Submenu");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
