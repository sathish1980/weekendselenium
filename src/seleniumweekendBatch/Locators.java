package seleniumweekendBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	/*	WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sathish.kumar");*/
		/*WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("sathish.kumar");
		//username.clear();
		username.sendKeys("kumar");*/
		/* WebElement username=driver.findElement(By.className("inputtext _55r1 _6luy"));
		username.sendKeys("sathish.kumar");
		//username.clear();
		username.sendKeys("kumar");*/
		
		/*WebElement frgt=driver.findElement(By.linkText("Forgotten password?"));
		frgt.click();*/
		
		/*WebElement frgt=driver.findElement(By.partialLinkText("password?"));
		frgt.click();*/
		
		//Css selector
		
		/*WebElement username=driver.findElement(By.cssSelector("input[name=email]"));
		username.sendKeys("sathish.kumar");
		//username.clear();
		username.sendKeys("kumar");*/
		
		//Xpath
		WebElement username=driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]"));
		username.sendKeys("sathish.kumar");
		//username.clear();
		username.sendKeys("kumar");
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators l = new Locators();
		l.launch();
	}

}
