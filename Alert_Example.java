package Basic_Commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse Tutorials\\eclipse-workspace\\Selenium_Tutorial\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button")).click();
		Alert al1=driver.switchTo().alert();
		//Thread.sleep("2000");
		al1.accept();
		Thread.sleep(2000);
		//System.out.println(al1.getText());
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
		Alert al2=driver.switchTo().alert();
		al2.dismiss();
		//System.out.println(al2.getText());
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button")).click();
		Alert al3=driver.switchTo().alert();
		al3.sendKeys("ABCD");
		al3.accept();
		//System.out.println(al3.getText());
		
		driver.findElement(By.id("btn")).click();
		Alert al4=driver.switchTo().alert();
		al4.accept();
		//System.out.println(al4.getText());
		driver.quit();
			
}
}
