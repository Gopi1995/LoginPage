package Basic_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\Eclipse Tutorials\\\\eclipse-workspace\\\\Selenium_Tutorial\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		WebElement btntohome = driver.findElement(By.id("home"));
		btntohome.click();
		WebElement claslink= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img"));
		claslink.click();
		WebElement position=driver.findElement(By.id("position"));
		Point pnt=position.getLocation();
		int x=pnt.getX();
		int y=pnt.getY();
		System.out.println("X position is");
		System.out.println(x);
		System.out.println("Y position is");
		System.out.println(y);
		WebElement clr=driver.findElement(By.id("color"));
		String color = clr.getCssValue("background-color");
		System.out.println(color);
		WebElement size=driver.findElement(By.id("size"));
		//size.getSize().getHeight();
		//size.getSize().getWidth();
		System.out.println("Hieght" +size.getSize().getHeight());
		System.out.println("Width" +size.getSize().getWidth());		

}
}
