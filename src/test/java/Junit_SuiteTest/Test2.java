package Junit_SuiteTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	static WebDriver driver;
	static String url = "https://mp3.zing.vn/";
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Documents\\\\SelfLearning\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("before class");
		driver.get(url);
		driver.quit();
	}
	
	@Test
	public void test2() {
		System.out.println("2");
	}
}
