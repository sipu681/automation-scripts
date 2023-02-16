package Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
public class Retrive_links 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\google.com");
		List<WebElement>links = driver.findElements(By.tagName("a"));
		for(WebElement alllinks:links)
			System.out.println(alllinks.getText());
		    Thread.sleep(3000);
		    driver.quit();

	}

}
