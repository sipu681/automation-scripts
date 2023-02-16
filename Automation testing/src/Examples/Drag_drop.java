 package Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
public class Drag_drop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		//Verify Title: stop execution in case of condition failed: Assert statement
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("Title matched");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Actions ac = new Actions (driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
		Thread.sleep(3000);
		System.out.println("Drag and Drop completed");
		driver.close();

	}

}
