package Basic_Commands;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {

	public static void main(String[] arirfhdjbfxznkjhjdfh) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Tutorials\\eclipse-workspace\\Selenium_Tutorial\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.google.com/search?q=greens&oq=greens&aqs=chrome..69i57.1964j0j7&sourceid=chrome&ie=UTF-8");
		driver.quit();
		
	}

}
