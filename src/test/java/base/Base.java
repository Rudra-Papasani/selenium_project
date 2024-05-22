package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void initialize() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		// Commenting the below line due to incompatibility with Chrome 116
		//WebDriverManager.chromedriver().setup();
		
    	driver = new ChromeDriver(chromeOptions);

    	//String url = prop.getProperty("loginURL");
    	String url = "https://www.amazon.in/";
    	driver.get(url);
    	
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

}
