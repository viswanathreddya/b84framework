package practies;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url=new URL("https://oauth-viswanath.te.77-dee7d:1bfb8643-8132-43e5-ae9d-e01a97ec0705@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		ChromeOptions browseroptions=new ChromeOptions();
		RemoteWebDriver driver=new RemoteWebDriver(url, browseroptions);
		driver.get("http:/google.com/");
		
	}

}
