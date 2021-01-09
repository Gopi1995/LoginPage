package Basic_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopinath GB\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		WebElement ys=driver.findElement(By.xpath("//*[@id=\'first\']/label[1]"));
		ys.click();
		
		WebElement unchk=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement chk=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean status1= unchk.isSelected();
		boolean status2=chk.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement age=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		age.click();

	}

}
