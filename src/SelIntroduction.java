import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author DChoudhary5
 *
 */
public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking the browser
		//ChromeDriver driver = new ChromeDriver();
		// Chrome 
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\DChoudhary5\\Documents\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		// Edge
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DChoudhary5\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
