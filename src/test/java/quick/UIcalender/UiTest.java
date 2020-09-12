package quick.UIcalender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTest {

	@Test
	
	public void calender() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[2]")).getText().contains("November")) {
			
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[3]")).click();
		}
		
		List<WebElement> lis = driver.findElements(By.xpath("//td[@class='day']"));
		
		int a = lis.size();
		
		for(int i=0;i<a;i++) {

			String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
			
			if(text.contains("23")) {
				driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
				break;
			}
		}
		
	}
}
