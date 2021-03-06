package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	//By Email = By.xpath("(//div[contains(.,'Email')])[8]");
	//By Email = By.xpath("(//input[contains(@name,'first')])[1]");
	
	By Email = By.xpath("//input[contains(@id,'wtf2-input-2')]");
	By Password = By.xpath("//input[contains(@id,'wtf2-input-3')]");
	//By eyeIcon = By.xpath("//wtf2-icon[contains(.,'visibility_off')]");
	//By Rememberme = By.xpath("//span[contains(.,'Remember me')])[1]");
	By SignINButton = By.xpath("(//button[@type='submit'])[1]");
	By Client = By.xpath("//span[@class='ng-star-inserted'][contains(.,'Client')]");
	By AddClient = By.xpath("(//span[contains(.,'Add Client')])[2]");
	By FirstName = By.xpath("//input[@formcontrolname='firstname']");
	By LastName = By.xpath("//input[@formcontrolname='lastname']");
	By EmailAddress = By.xpath("//input[@name='emailId']");
	By AddOrg = By.xpath("(//span[contains(.,'Add Organization')])[2]");
	By OrgName = By.xpath("//input[@formcontrolname='tenantName']");
	By FinStart = By.xpath("//input[@formcontrolname='financialStartDate']");
	By FinBegDate = By.xpath("//input[@formcontrolname='bookBeginningStartDate']");
	By Address1 = By.xpath("//input[@formcontrolname='address1']");
	By City = By.xpath("//input[contains(@id,'mat-input-6')]");
	By State = By.xpath("(//input[contains(@formcontrolname,'state')])[2]");
	By Zipcode = By.xpath("//input[contains(@id,'mat-input-8')]");
	By TaxID = By.xpath("//input[contains(@formcontrolname,'gstNo')]");
	By CollectTax = By.xpath("//input[@formcontrolname='nexus']");
	By SaveButton = By.xpath("//button[contains(.,'Save')]");
	By Next = By.xpath("//span[@class='wtf2-button-wrapper' and text()=' NEXT ']");
	By Next1 = By.xpath("//span[@class='wtf2-button-wrapper' and text()=' NEXT ']");
	By Next2 = By.xpath("//span[@class='wtf2-button-wrapper' and text()=' NEXT ']");
	By Cardnumber = By.xpath("//input[@name='cardnumber']");
	By ExpDate = By.xpath("//input[@name='exp-date']");
	By CVV = By.xpath("//input[@name='cvc']");
	By Addressline1 = By.xpath("//input[@formcontrolname='addressLine1']");
	By Addressline2 = By.xpath("//input[@formcontrolname='addressLine2']");
	By Zip = By.xpath("//input[@formcontrolname='zip']");
	By CityA =By.xpath("//input[@formcontrolname='city']");
	By StateA = By.xpath("//input[@formcontrolname='state']");
	By CountryA = By.xpath("//input[@formcontrolname='country']");
	By Checkout = By.xpath("//span[@class='wtf2-button-wrapper'][contains(.,'CHECKOUT')]");
	
	
	public WebElement EmailID()
	{
		return driver.findElement(Email);
	}
  	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	/*
	public WebElement EyeIcon()
	{
		return driver.findElement(eyeIcon);
	}
	
	public WebElement Remembermecheck()
	{
		//return driver.findElement(Rememberme);
	}
	*/
	public WebElement SignINButton()
	{
		return driver.findElement(SignINButton);
	}
	
	public WebElement Clientbutton()
	{
		return driver.findElement(Client);
	}
	
	public WebElement AddClientbutton()
	{
		return driver.findElement(AddClient);
	}
	
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement LastName()
	{
		return driver.findElement(LastName);
	}
	
	
	public WebElement EmailAddress()
	{
		return driver.findElement(EmailAddress);
	}
	
	public WebElement AddOrg()
	{
		return driver.findElement(AddOrg);
	}
	
	public WebElement OrgName()
	{
		return driver.findElement(OrgName);
	}
	
	public WebElement FinStart()
	{
		return driver.findElement(FinStart);
	}
	
	public WebElement FinBegDate()
	{
		return driver.findElement(FinBegDate);
	}
	
	public WebElement Address1()
	{
		return driver.findElement(Address1);
	}
	
	public WebElement TaxID()
	{
		return driver.findElement(TaxID);
	}
	
	public WebElement CollectTax()
	{
		return driver.findElement(CollectTax);
	}
	
	public WebElement SaveButton()
	{
		return driver.findElement(SaveButton);
	}
	
	
	public WebElement Next()
	{
		return driver.findElement(Next);
	}
	
	public WebElement Next1()
	{
		return driver.findElement(Next1);
	}
	public WebElement City()
	{
		return driver.findElement(City);
	}
	
	public WebElement State()
	{
		return driver.findElement(State);
	}
	
	public WebElement Zipcode()
	{
		return driver.findElement(Zipcode);
	}
	
	public WebElement Next2()
	{
		return driver.findElement(Next2);
	}
	
	public WebElement Cardnumber()
	{
		return driver.findElement(Cardnumber);
	}
	

	public WebElement ExpDate()
	{
		return driver.findElement(ExpDate);
	}
	
	public WebElement CVV()
	{
		return driver.findElement(CVV);
	}
	
	public WebElement Addressline1()
	{
		return driver.findElement(Addressline1);
	}
	public WebElement Zip()
	{
		return driver.findElement(Zip);
	}
	public WebElement CityA()
	{
		return driver.findElement(CityA);
	}
	public WebElement StateA()
	{
		return driver.findElement(StateA);
	}
	
	public WebElement CountryA()
	{
		return driver.findElement(CountryA);
	}
	public WebElement Checkout()
	{
		return driver.findElement(Checkout);
	}
	
	public WebElement Addressline2()
	{
		return driver.findElement(Addressline2);
	}
}
