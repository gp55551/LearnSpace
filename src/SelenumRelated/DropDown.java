package SelenumRelated;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(15000);
		System.out.println("wait");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		
		driver.close();
		
		
	}

}
