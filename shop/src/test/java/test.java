

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class test {
		String user = "0009";
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
		public void UserCreation() throws InterruptedException {
			driver.manage().window();
			driver.get("http://automationpractice.com/index.php");}


	}

