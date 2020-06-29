package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Java\\cHROME\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
	
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Sign in")).click();
		
	
		Thread.sleep(5000);
		
		/*
		 * driver.findElement(By.name("firstname")).sendKeys("Jhon");
		 * 
		 * driver.findElement(By.name("lastname")).sendKeys("david");
		 */

		//driver.findElement(By.partialLinkText("Learn about")).click();
		
		driver.findElement(By.xpath("//*[@id = 'firstname']")).sendKeys("Jhon");  //Relative Xpath
		
		driver.findElement(By.xpath("/html/body/div[1]/form[1]/div/div[1]/div/div[3]/div/div[1]/div/span[2]/div/div[1]/input")).sendKeys("david");  //Absolute Xapth
		
	
		

	}

}
