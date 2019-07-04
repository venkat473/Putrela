package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Prog1
{
	public static void main(String[] args)throws Exception
	{

		System.setProperty("webdriver.chrome.driver","D:\\driverz\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.name("identifier")).sendKeys("krishnav373");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("8374369738");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();

	}
}
