package Basic_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class debug {
	
	public static void main (String[]args)throws InterruptedException{ 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopinath GB\\eclipse-workspace\\GreensProject\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.snapchat.com/accounts/login?continue=https%3A%2F%2Faccounts.snapchat.com%2Faccounts%2Fwelcome");
		
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("//*[@id=\"login-root\"]/div/div[3]/article/div[2]/a"));
		create.click();
		
		Thread.sleep(3000);
		
		WebElement frstname = driver.findElement(By.xpath("//input[name='firstname']"));
		frstname.sendKeys("jiiva");
		driver.quit();
	   
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
