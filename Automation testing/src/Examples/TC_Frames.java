package Examples;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class TC_Frames 
{
	static String  url     = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      driver.navigate().to(url);
      driver.findElement(By.name("txtUserName")).sendKeys(username);
      driver.findElement(By.name("txtPassword")).sendKeys(password);
      driver.findElement(By.name("Submit")).click();
      driver.switchTo().frame("rightMenu");
      driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
      Thread.sleep(3000);
      driver.findElement(By.name("txtEmpFirstName")).sendKeys("sipu");
      driver.findElement(By.name("txtEmpLastName")).sendKeys("selenium");
      driver.findElement(By.id("btnEdit")).click();
      Thread.sleep(3000);
      driver.switchTo().defaultContent();
      driver.findElement(By.linkText("Logout")).click();
      driver.close();
      
	}

}