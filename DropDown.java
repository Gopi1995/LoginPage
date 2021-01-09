package Basic_Commands;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopinath GB\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement DD1=driver.findElement(By.id("dropdown1"));//take by id
		Select sel1=new Select(DD1);//create select object and acces the webelement obejct
		sel1.selectByIndex(2);
		WebElement DD2=driver.findElement(By.name("dropdown2"));
		Select sel2=new Select(DD2);
		sel2.selectByValue("4");
		WebElement DD3=driver.findElement(By.id("dropdown3"));
		Select sel3=new Select(DD3);
		sel3.selectByVisibleText("Selenium");
		WebElement DD4=driver.findElement(By.className("dropdown"));
		Select sel4=new Select(DD4);
		List <WebElement> count= sel4.getOptions();
		count.size();
		System.out.println("No of count"+count.size());
		WebElement DD5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		Select sel5=new Select(DD5);
		DD5.sendKeys("sel");
		WebElement DD6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select sel6=new Select(DD6);
		sel6.selectByIndex(0);
		sel6.selectByIndex(1);
		sel6.selectByIndex(2);
		
		
		
		//to select multiple option use method isMultiple
		
		
	}

}
