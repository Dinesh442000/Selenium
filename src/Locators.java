import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DChoudhary5\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Dinesh");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Dinesh");
		driver.findElement(By.className("submit")).click();
	
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// <input type="text" placeholder="Name">
		//using x path
		// input[@placeholder='Name'];
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dinesh");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Dinesh@gmmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("DineshOP@gmmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9145339");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	}

}
