package TestCases;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectRepository.Loginpage;

public class LoginTestcases {
	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://reality-qa.deskera.xyz/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//Thread.sleep(12000);
		Loginpage Lp=new Loginpage(driver);
		WebDriverWait wait=new WebDriverWait(driver, 300);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'first')])[1]")));

		wait.until(ExpectedConditions.elementToBeClickable(Lp.EmailID()));
		wait.until(ExpectedConditions.elementToBeClickable(Lp.Password()));
		
		
		Lp.EmailID().sendKeys("bhagwan.jadhavbook@getnada.com");
		Lp.Password().sendKeys("Deskera@123");
		//Lp.EyeIcon().click();
		//Lp.Remembermecheck().click();
		Lp.SignINButton().click();
		
		Thread.sleep(8000);
		WebDriverWait wait10=new WebDriverWait(driver, 100);
		wait10.until(ExpectedConditions.elementToBeClickable(Lp.Clientbutton()));
		
		Lp.Clientbutton().click();
		Lp.AddClientbutton().click();
		Lp.FirstName().sendKeys("Globex");
		Lp.LastName().sendKeys("Corporation");
		Lp.EmailAddress().sendKeys("operation3@getnada.com");
		Lp.AddOrg().click();
		Lp.OrgName().sendKeys("DeskeraIndia");
		Lp.FinStart().sendKeys("2020-07-01");
		Lp.FinBegDate().sendKeys("2020-07-01");
		Lp.Address1().sendKeys("washington avenue ext");
		
		Lp.City().sendKeys("Albany");
		Lp.State().sendKeys("Alabama");
		Lp.Zipcode().sendKeys("12205");
		Lp.TaxID().sendKeys("123456789");
		Lp.CollectTax().sendKeys("New York");
		Thread.sleep(2000);
		Lp.SaveButton().click();
		Thread.sleep(2000);
		WebDriverWait wait1=new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(Lp.Next()));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='wtf2-button-wrapper' and text()=' NEXT ']"))).click().perform();
		
		//Lp.Next().click();
		Thread.sleep(2000);
		WebElement Element1 = driver.findElement(By.xpath("//span[@class='wtf2-button-wrapper' and text()=' NEXT ']"));

        action.moveToElement(Element1).build().perform();
        action.moveToElement(driver.findElement(By.xpath("//span[contains(.,'NEXT')]"))).click().perform();
	

      
        Thread.sleep(2000);
        Actions action1 = new Actions(driver);
		WebElement Element2 = driver.findElement(By.xpath("//span[@class='wtf2-button-wrapper' and text()=' NEXT ']"));
		action1.moveToElement(Element2).build().perform();
	    action1.moveToElement(driver.findElement(By.xpath("//span[@class='wtf2-button-wrapper' and text()=' NEXT ']"))).click().perform();
		
	    Thread.sleep(2000);
	    driver.switchTo().frame("__privateStripeFrame5");
		Lp.Cardnumber().sendKeys("4111 1111 1111 1111");
		Lp.ExpDate().sendKeys("12 / 25");
		Lp.CVV().sendKeys("123");
		driver.switchTo().defaultContent();
		Lp.Addressline1().clear();
		Lp.Addressline1().sendKeys("Yerwada");
		Lp.Addressline2().clear();
		Lp.Addressline2().sendKeys("Pune");
		Lp.Zip().clear();
		Lp.Zip().sendKeys("414301");
		Lp.CityA().clear();
		Lp.CityA().sendKeys("Pune");
		Lp.StateA().clear();
		Lp.StateA().sendKeys("Maharashtra");
		Lp.CountryA().clear();
		Lp.CountryA().sendKeys("India");
		Lp.Checkout().click();
	}

}
