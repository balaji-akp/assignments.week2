package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		
		WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
        driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement cnElement = driver.findElement(By.id("createLeadForm_companyName"));
		cnElement.sendKeys("TestLeaf");
		
		WebElement fnElement = driver.findElement(By.id("createLeadForm_firstName"));
		fnElement.sendKeys("Balaji");
		
		WebElement lnElement = driver.findElement(By.id("createLeadForm_lastName"));
		lnElement.sendKeys("P");
		
		WebElement findElement = driver.findElement(By.name("dataSourceId"));
		findElement.click();
		Select se =new Select(findElement);
		se.selectByIndex(2);
		
		WebElement findElement1 = driver.findElement(By.name("marketingCampaignId"));
		findElement1.click();
		Select se1 =new Select(findElement1);
		se1.selectByIndex(2);
		
		WebElement fnlElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		fnlElement.sendKeys("Bala");
		
		WebElement dnElement = driver.findElement(By.id("createLeadForm_departmentName"));
		dnElement.sendKeys("Art Department");
		
		WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
		descriptionElement.sendKeys("Creating a New Lead");
		
		WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("ibalaji.padmanaban@gmail.com");
											
		WebElement elementStateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementStateDropDown);
		dd.selectByVisibleText("New York");

		Thread.sleep(2000);
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("The title is:"+ driver.getTitle());
		
		if(driver.getTitle().contains("Testleaf"))
		{
			System.out.println("I Confirm the title has Testleaf");
		}
		else
			System.out.println("The title doesn't have the word Testleaf");
		
		driver.close();
		
		}
}
