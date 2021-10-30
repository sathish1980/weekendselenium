package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {

	public void ft()
	{
		//webdriver.gecko.driver
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://en-gb.facebook.com/");
		//driver.get("https://www.gmail.com");
		//driver.navigate().to("https://www.gmail.com");
		driver.get("https://en-gb.facebook.com/");
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		driver.manage().window().maximize();
		WebElement username=	driver.findElement(By.id("email"));
		username.sendKeys("kumar.sathish189@gmail.com");
		username.clear();
		username.sendKeys("kumar.sathish189");
		WebElement password=	driver.findElement(By.name("pass"));
		password.sendKeys("Admin@123");
		WebElement login=	driver.findElement(By.name("login"));
	//	login.click();
		
		//WebElement forgot=	driver.findElement(By.linkText("Forgotten password?"));
		WebElement forgot=	driver.findElement(By.partialLinkText("Forgotten"));
		forgot.click();
		
		driver.findElement(By.cssSelector("input#identify_email")).sendKeys("9159211184");
		//driver.findElement(By.cssSelector("input.inputtext _9o1w")).sendKeys("9159211184");
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("9159211184");
		
		driver.findElement(By.cssSelector("input.inputtext _9o1w[type=text]")).sendKeys("9159211184");
		//driver.findElement(ByCssSelector("")).sendKeys("");
		
		//driver.close();
		//driver.quit();
		//Xpath
		driver.findElement(By.xpath("//a[@id='u_0_2_vp']")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'_42ft')])[4]")).click();
		driver.findElement(By.xpath("//a[starts-with(@class,'_42ft') and"
				+ " @data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//
		//(//select[@id='day']//following::option)[31]
		////select[@id='day']//child::option
		////option[@value='1']//ancestor::span
		//select[@id='day']//following-sibling::option
		//(//span[@data-name='birthday_wrapper']//descendant::select)[2]//option[3]
		
		//driver.findElement(By.xpath("(//span[@data-name='birthday_wrapper']//descendant::select)[2]//option[3]").click();)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firsttestcase ft = new firsttestcase();
		ft.ft();
	}

}
