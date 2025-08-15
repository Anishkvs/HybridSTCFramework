package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test {

//	@Test
 public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.edge.driver", "D:\\ADriver\\msedgedriver.exe");
//	WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.quit();
}
	
}