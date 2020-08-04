package test1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	String user = "Dress";
	String pass = "0009";
	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\The_Demo_site\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void ItemSearch() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");

		WebElement target = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		target.sendKeys(user);
		target.submit();
		Thread.sleep(2000);
		String target2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText();
		assertEquals("\"DRESS\"", target2);
		fullscreen();
//		UserLogin();
	}
	
	

	
	
	public void fullscreen() {
		driver.manage().window().fullscreen();
	}
}
