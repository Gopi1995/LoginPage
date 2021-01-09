package Basic_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse Tutorials\\eclipse-workspace\\Selenium_Tutorial\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		//two types link text only available
		
		WebElement fulllink= driver.findElement(By.linkText("Go to Home Page"));//by entering the full link text
		fulllink.click();
		
		Thread.sleep(3000);
		
		WebElement claslink= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a/img"));
		claslink.click();
		
		WebElement halflink=driver.findElement(By.partialLinkText("Find where am suppose"));//by entering the partial link text
		halflink.click();
		
	}

}
