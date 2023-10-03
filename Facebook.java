package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("kishore");
		driver.findElement(By.name("lastname")).sendKeys("vicky");
		driver.findElement(By.name("reg_email__")).sendKeys("8248828858");
		driver.findElement(By.name("reg_passwd__")).sendKeys("0123456789");
		Thread.sleep(6000);
		WebElement dob = driver.findElement(By.id("day"));
		Select dob_date = new Select(dob);
		dob_date.selectByVisibleText("17");

		WebElement JNmonth = driver.findElement(By.id("month"));
		Select month = new Select(JNmonth);
		month.selectByIndex(0);

		WebElement JNyear = driver.findElement(By.id("year"));
		Select year = new Select(JNyear);
		year.selectByValue("1992");
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}

}
