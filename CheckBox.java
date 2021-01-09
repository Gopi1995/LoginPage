package Basic_Commands;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopinath GB\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Tutorials\\eclipse-workspace\\Selenium_Tutorial\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement deselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if(deselect.isSelected())
		{
			deselect.click();
		}
		WebElement select=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(select.isSelected())
		{
			select.click();
		}
		
		

}
}
