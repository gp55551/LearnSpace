package PractiseMar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn11April {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d; 
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.google.com");
		System.out.println(d.getTitle());
		d.quit();
		
		d.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		
		
		
	}
}
