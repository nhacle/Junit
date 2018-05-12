package Junit_Annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annotation {
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
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Documents\\\\SelfLearning\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.quit();
		System.out.println("before");
	}
	@Test
	public void test1() {
		System.out.println("1");
	}
	
	@Test 
	public void test2() {
		System.out.println("2");
	}
	
	@After
	public void aflter() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void aflterClass() {
		System.out.println("after class");
	}
	

}
