package seleniumclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Listexample {
	
	public void list(String comparetext)
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='fsw_inner']//child::input)[1]")));
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//click the field to see the list
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		WebElement fromfield=driver.findElement(By.xpath("(//div[@class='fsw_inner']//child::input)[1]"));
		fromfield.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@role='listbox']//li[1]//div[2]")));
		List<WebElement> fromlist=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		int size=fromlist.size();
		for(int i=1;i<=size;i++)
		{
			WebElement eachvalue=driver.findElement(By.xpath("//ul[@role='listbox']//li["+i+"]//div[2]"));
			String eachtextvalue=eachvalue.getText();
			if(eachtextvalue.equalsIgnoreCase(comparetext))
			{
				wait.until(ExpectedConditions.elementToBeClickable(eachvalue));
				eachvalue.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listexample ls = new Listexample();
		ls.list("PNQ");
	}

}
