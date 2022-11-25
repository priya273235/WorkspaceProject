package Edureka.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class App {
	@Test

	public void Jenkinstest() {

		System.setProperty("webdriver.chrome.driver", "/home/edureka/Desktop/chromedriver_linux64 (1)/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);

		System.out.println("Hi, Welcome to Edureka's YouTube Livesession on Selenium WebDriver");
		driver.get("http://localhost:8080");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("j_username")).sendKeys("edureka");
		driver.findElement(By.name("j_password")).sendKeys("edureka");
		driver.findElement(By.name("Submit")).click();

	}
}
