package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args)
	{
	
		// open chrome browser
		//launch url  weborder
		//enter unmae
		//enter pwd
		//click on login
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Java\\cHROME\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		//driver.navigate().to("http://secure.smartbearsoftware.com/testcomplete11/WebOrders/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equalsIgnoreCase("Web Orders Login"))
		{
			System.out.println("URL is success");
		}
		else
		{
			System.out.println("URL got crash");
		}
	
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		String Homepage = driver.getTitle();
		if(Homepage.equalsIgnoreCase("Web Orders"))
		{
			System.out.println("login is success");
		}
		else
		{
			System.out.println("login is failed");
		}
		
		
		
		
		

	
	
		
		
		

	}

}
