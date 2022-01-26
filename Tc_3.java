package week2.day1.assignments.completed;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_3 {

	public static void main(String[] args) {
		// Test Case 3
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String url = "http://leaftaps.com/opentaps/control/login";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company Name");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First Name");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last Name");
		
		WebElement source1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(source1);
		dd1.selectByIndex(1);
		
		WebElement source2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(source2);
		dd2.selectByValue("9002");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FNameLocal");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("LNameLocal");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Salutation");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/15/2022");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Depatment");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000000");
		
		WebElement source3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3 = new Select(source3);
		dd3.selectByVisibleText("AMD - Armenian Dram");
		
		WebElement source4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4 = new Select(source4);
		dd4.selectByIndex(1);
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");

		WebElement source5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5 = new Select(source5);
		dd5.selectByVisibleText("Sole Proprietorship");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticket Symbol");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note", Keys.TAB);
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04327");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("244516");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("Extension");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Personal");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.test.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("General");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Attention Name");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("City");
		
		WebElement source6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6 = new Select(source6);
		dd6.selectByIndex(2);
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("621010");
		
		
		WebElement source7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd7 = new Select(source7);
		dd7.selectByVisibleText("American Samoa");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("123");
		
		
		String fName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println(fName);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String currentPageTitle = driver.getTitle();
		System.out.println(currentPageTitle);
		
		String actualPageTitle = "View Lead | opentaps CRM";
		
		if(actualPageTitle.equals(currentPageTitle)) {
			
			System.out.println("Actual & Expected page title both are same");			
			
		}else {
			
			System.out.println("Actual & Expected page title both are not same");
			
		}
		

	}

}
