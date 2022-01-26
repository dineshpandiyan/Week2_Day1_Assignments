package week2.day1.assignments.completed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_1 {

	public static void main(String[] args) {
		// Test Case 1
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new  ChromeDriver();
		
		String url = "http://leaftaps.com/opentaps/";
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		
		WebElement contacts = driver.findElement(By.linkText("Contacts"));
		contacts.click();
		
		WebElement cCont = driver.findElement(By.linkText("Create Contact"));
		cCont.click();
		
		WebElement fName = driver.findElement(By.id("firstNameField"));
		fName.sendKeys("testing1");
		
		WebElement lName = driver.findElement(By.id("lastNameField"));
		lName.sendKeys("testing2");
		
		WebElement cButt = driver.findElement(By.className("smallSubmit"));
		cButt.click();
		
		String printFName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(printFName);
		
		String bTitle = driver.getTitle();
		System.out.println(bTitle);
		
		driver.close();

	}

}
