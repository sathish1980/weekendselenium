package seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class secondclass {

	public void launch()
	{
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
	//	driver.findElement(By.xpath("(//span[@data-name='birthday_wrapper']//descendant::select)[1]")).click();
		//*[@id="day"]
		//implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	/*	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(By.xpath("(//div[@class='_6ltg']//child::a)")).click();
	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement
			(By.xpath("(//div[@class='_6ltg']//child::a)"))));
		
	/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		wait.until(ExpectedConditions.presenceOfElementLocated((By.name("firstname"))));
		
		/*Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);*/
		
		driver.findElement(By.name("firstname")).sendKeys("9159211184");
		WebElement dyadrop= driver.findElement(By.xpath("//select[@id='day']"));
		Select dayd=new Select(dyadrop);
		dayd.selectByIndex(10);
		WebElement mondrop= driver.findElement(By.xpath("//select[@id='month']"));
		Select mon=new Select(mondrop);
		mon.selectByValue("5");
		WebElement yrdrop= driver.findElement(By.xpath("//select[@id='year']"));
		Select yr=new Select(yrdrop);
		yr.selectByVisibleText("2000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondclass sc= new secondclass();
		sc.launch();
	}

}
