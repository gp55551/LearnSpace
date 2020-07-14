package PractiseMar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//alerts can be used in browser related pop ups
		// if alerts not working we can use java script executor
		
		WebDriver driver ; 
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();	
        System.out.println("deleting");
        
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        driver.quit();
        
        
	}

}
