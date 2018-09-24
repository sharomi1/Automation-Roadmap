import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyMainClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Automation//BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
