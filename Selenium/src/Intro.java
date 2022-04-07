import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking Browser
		//WebDriver Interface above all WebDrivers i.e. ChromeDriver, FirefoxDriver etc
		//Chrome - chromeDriver - Method - close get
		//Firefox - FirefoxDriver - Method - close get
		//WebDriver Methods + Class own Methods if used specific WebDriver say ChromeDriver, FirefoxDriver etc
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://mvnrepository.com/");
		System.out.println( driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); // It closes the current window only the original window will get closed
		//driver.quit() // It closes all the associated windows irrespective of current window which are opened via automation
		
		
	}

}
