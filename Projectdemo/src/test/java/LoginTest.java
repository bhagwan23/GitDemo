
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LoginTest
{
	 @Test
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
		
	}

}
