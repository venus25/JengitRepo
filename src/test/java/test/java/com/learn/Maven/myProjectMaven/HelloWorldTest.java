package test.java.com.learn.Maven.myProjectMaven;

 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {

	
	@Test
	public void Login() {
		System.out.println("Logging into the account");
	    System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.google.com/");
	    driver.close();
	  
	
	}
}
