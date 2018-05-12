package Junit_SuiteTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	static WebDriver driver;
	static String url = "https://www.google.com.vn";
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Documents\\\\SelfLearning\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("before class");
		driver.get(url);
		driver.quit();
	}
	
	@Test
	public void test1() {
		System.out.println("1");
	}
}
