package Basic_Commands;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

import net.bytebuddy.asm.Advice.Enter;

public class LinkExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Tutorials\\eclipse-workspace\\Selenium_Tutorial\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://leafground.com/pages/Edit.html");
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("gopinath1995");
			WebElement keyboard=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
			keyboard.sendKeys("gopinath Apended");
			WebElement deafult=driver.findElement(By.name("username"));
			//String value = deafult.getAttribute("value");
			System.out.println(deafult.getAttribute("value"));
			
			Thread.sleep(2000);
			WebElement clearname=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
			clearname.clear();
			WebElement able=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
			boolean enable=able.isEnabled();
			
			System.out.print(enable);			
	}

}
