package Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class web_table {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E:\\java\\web_table.html");
		Thread.sleep(3000);
		//count 
		int row = driver.findElements(By.xpath("//*[@id = 'idCourse']/tbody/tr")).size();
		Thread.sleep(3000);
		int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println("count rows "+row);
		System.out.println("count column "+col);
		System.out.println("Count row_col is "+row_col);
		Thread.sleep(3000);
		//data from cells
		String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[3]/td[2]")).getText();
		System.out.println("celldata :"+celldata);
		//data from table
		for (int i = 1;i<=row;i++)
			
		{
	String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			Thread.sleep(1000);
			System.out.println(data);
		}
			driver.quit();
		}
	}


