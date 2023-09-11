package org.pirai;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class piraiweb {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.gecko.driver","F:\\prasanna\\Automation\\sel\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://piraiinfo.com/");
		
		
		WebElement aboutus = driver.findElement(By.xpath("(//a[text()='About Us'])[2]"));
		aboutus.click();
		Thread.sleep(3000);
		WebElement service = driver.findElement(By.xpath("(//a[text()='Services'])[2]"));
		service.click();
		Thread.sleep(3000);
		WebElement dev = driver.findElement(By.id("devOps"));
		dev.click();
		WebElement enquiry = driver.findElement(By.xpath("//button[text()='Enquire Now']"));
		enquiry.click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
		firstname.sendKeys("prasanna");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
		lastname.sendKeys("Sakthivel");
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@type,'email')]"));
		email.sendKeys("prasanna123@gmail.com");
		
		WebElement phnno = driver.findElement(By.xpath("//input[contains(@type,'tel')]"));
		phnno.sendKeys("7896543209");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)");
		WebElement subject = driver.findElement(By.xpath("(//input[@name='toclick'])[3]"));
		subject.click();

		WebElement msg = driver.findElement(By.xpath("//*[@name='message']"));
		msg.sendKeys("develop");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	    submit.click();
		System.out.println("runsuccessfully");

	}

}
