package Basic_Commands;

import java.awt.RenderingHints.Key;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Open_Google {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Tutorials\\eclipse-workspace\\Selenium_Tutorial\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://insights.upwave.com/0804938d-e9c9-47f5-bd58-c2e18a4be805/target/");//opening google page 
		/*WebElement google=driver.findElement(By.name("q"));
		google.sendKeys("covid"+Keys.ENTER);//Passing values what we want to search in google
*/		//WebElement cow=driver.findElement(By.xpath("/html/body/nav/ul/li[3]/button"));
	
		WebElement cow=driver.findElement(By.xpath("//button[contains(text(),'Sign in / Sign up')]"));
		cow.click();
		WebElement go=driver.findElement(By.xpath("//body/nav[1]/ul[1]/li[3]/div[1]/div[1]/sign-up-compact[1]/form[1]/div[1]/input[1]"));
		go.sendKeys("gopinath.baskaran@survata.com");
		WebElement cow1=driver.findElement(By.xpath("//body/nav[1]/ul[1]/li[3]/div[1]/div[1]/sign-up-compact[1]/form[1]/div[2]/input[1]"));
		cow1.sendKeys("iopex@123");
		WebElement btn=driver.findElement(By.xpath("//body/nav[1]/ul[1]/li[3]/div[1]/div[1]/sign-up-compact[1]/form[1]/div[3]/div[1]/button[1]"));
		btn.click();
		
		
		/*cow.click();
		
		String strt=cow.getText();
		System.out.println(strt);
		driver.quit();*/
		//driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[3]/div[2]/div/div/div[1]/div/div/div[1]/a/div/cite")).click();
		
	}

}
