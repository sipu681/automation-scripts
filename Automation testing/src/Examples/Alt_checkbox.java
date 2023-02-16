package Examples;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.By;
 class Alt_checkbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		for (int i=1;i<=10;i=i+2) 
		{
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
			Thread.sleep(3000);
			System.out.println(i+ "th Checkbox marked completed");
		}
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();

	}

}
