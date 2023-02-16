package Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot 
{

	public static void main(String[] args) throws Exception
	{
      System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      try {
      driver.get("http://183.82.103.245/nareshit/login.php");
      Thread.sleep(3000);
      driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
      Thread.sleep(2000);
      driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
      Thread.sleep(2000);
      driver.findElement(By.name("Submit")).click();
      WebElement element = driver.findElement(By.linkText("PIM"));
      Actions action = new Actions(driver);
     action.moveToElement(element).perform();
     Thread.sleep(3000);
     driver.findElement(By.linkText("Add Employee123")).click();
     Thread.sleep(4000);
     System.out.println("Clicked on submenu");        
     driver.findElement(By.linkText("Logout")).click();
      }
      catch (Exception e) {
    	  File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFile(f1, new File("E:\\TestResults.png"));
    	  
    	  
      }
      driver.quit();
 }
}
