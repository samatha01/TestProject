package com.learn.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deltadental_getQuote1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www1.deltadentalins.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]")).click();
	driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("94105");
	driver.findElement(By.xpath("//input[@id='a_dob']")).sendKeys("09/08/1989");
	driver.findElement(By.xpath("//body[1]/main[1]/div[1]/form[1]/button[2]/i[1]")).click();
	driver.findElement(By.xpath("//input[@id='dep_dob_0']")).sendKeys("08/02/1999");
	driver.findElement(By.xpath("//button[@id='showPlans']")).click();
	
	driver.findElement(By.xpath("//body/main[@id='plan_options']/section[1]/div[2]/div[2]/div[2]/div[1]/div[3]/a[1]")).click();
	driver.findElement(By.xpath("//button[@id='appStart']")).click();
	//Personal Info
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Peter");
	driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("M");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("HUDSON");
	Select genderSelect=new Select(driver.findElement(By.xpath("//select[@id='gender']")));
	genderSelect.selectByVisibleText("Male");
	driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("078-00-5112");
	driver.findElement(By.xpath("//input[@id='alt_id']")).sendKeys("ccc@gmail.com");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[contains(text(),'Take me back to finish my enrollment')]")).click();
	driver.findElement(By.xpath("//input[@id='streetAddress']")).sendKeys("California");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("CA");
	driver.findElement(By.xpath("//input[@id='contactNumber']")).sendKeys("999-000-1111");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dmm@gmail.com");
	driver.findElement(By.xpath("//button[@id='nextButton']")).click();
	//driver.findElement(By.xpath("//body[1]/div[4]/div[9]/div[1]/div[1]/strong[1]/span[1]")).click();
	
		}

}
