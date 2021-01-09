package Basic_Commands;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse Tutorials\\eclipse-workspace\\Selenium_Tutorial\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afce1GMuytM_MCh10Md7fOa-TV4iQqxZDVX4zSBJcQb8axezHId5qkFLAwA9CkT6SzKk-X16Kw7835pH5dbJDX8rDXfiPWDgztclg5tTfwdmgw&smuh=22598&lh=Ac-33ssSn8NVOh-j");
		
		WebElement usname= driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		WebElement passbtn=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','gopi@yahoo.com')", usname);
		js.executeScript("arguments[0].setAttribute('value','12364')", password);
		js.executeScript("arguments[0].click", passbtn);
		//js.executeScript("gopi@yahoo.com", usname);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File fl=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(fl);
		
		//TO change the location of that screen shot
		
		File d=new File("D:\\seleinium vcvvxv.png");
		FileUtils.copyFile(fl, d);
		driver.quit();
		
		

		
		
		
		
		
		

	}

}
