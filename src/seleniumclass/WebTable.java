package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {
	
	public void webtable(String searchtext)
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//finding row total size
		List<WebElement> rowcount=driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int rowsize=rowcount.size();
		for(int i=2;i<=rowsize;i++)
		{
			//finding column total size
			List<WebElement> columncount=driver.findElements(By.xpath("//table[@id='table_id']//tr["+i+"]//td"));
			int colsize=columncount.size();
			/*for(int j=1;j<colsize;j++)
			{
				//WebElement textvalue=driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]//td["+j+"]"));
						
			}*/
			WebElement textvalue=driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]//td[1]"));
			String actualtext=textvalue.getText();
			
			if(!actualtext.equalsIgnoreCase(searchtext))
			{
				driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]//td[3]//input")).click();
				//break;
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebTable W=  new WebTable();
		W.webtable("Learn to interact with Elements");
	}

}
