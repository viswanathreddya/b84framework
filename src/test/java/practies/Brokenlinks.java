package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) {
		// Set the path to your WebDriver executable (replace with the correct path)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage you want to check for broken links
        driver.get("https://example.com");

        // Find all links on the page
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

        // Create an empty list to store broken links
        java.util.List<String> brokenLinks = new java.util.ArrayList<>();

        // Check the status of each link
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href != null) {
                driver.get(href);
                if (driver.getPageSource().contains("404")) {
                    brokenLinks.add(href);
                }
            }
        }

        // Close the WebDriver
        driver.quit();

        // Print or handle the broken links
        if (!brokenLinks.isEmpty()) {
            System.out.println("Broken links:");
            for (String link : brokenLinks) {
                System.out.println(link);
            }
        } else {
            System.out.println("No broken links found.");
        }
	}

}
