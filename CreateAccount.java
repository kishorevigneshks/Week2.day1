package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	private static final WebElement Province = null;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kishorevignesh");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select Ind = new Select(Industry);
		Ind.selectByIndex(3);
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select Own = new Select(Ownership);
		Own.selectByVisibleText("S-Corporation");
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select src = new Select(Source);
		src.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketingCampaign = driver.findElement(By.name("marketingCampaignId"));
		Select MC = new Select(MarketingCampaign);
		MC.selectByIndex(6);
		WebElement StateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select State = new Select(StateProvince);
		State.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		// Get the Account name
		System.out.println(driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText());
		driver.close();

	}

}