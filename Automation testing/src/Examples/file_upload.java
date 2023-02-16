package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload 
{
	   public static void main(String args[]) throws Exception{
	        System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	        driver.findElement(By.name("Submit")).click();
	        Thread.sleep(4000);
	        driver.switchTo().frame("rightMenu");
	        driver.findElement(By.xpath("//input[@value='Add']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("nayak");
	        driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("sipu");
	WebElement fileInput = driver.findElement(By.
	              xpath("//input[@type='file'][@name='photofile']"));                      
	fileInput.sendKeys("C:\\Users\\HP\\Pictures\\IMG_20201229_125833.jpg");
	        Thread.sleep(4000);
	        System.out.println("File uploaded successfully");        
	        driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
	        Thread.sleep(4000);
	          System.out.println("New Employee Added");
	          driver.switchTo().defaultContent();
	          driver.findElement(By.linkText("Logout")).click();
	          driver.close();
	       
	    }
	}

