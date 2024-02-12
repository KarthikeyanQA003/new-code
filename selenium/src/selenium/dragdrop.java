package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://letcode.in/sortable");
		
		WebElement source=driver.findElement(By.xpath("//*[text()=' Fall asleep']"));
		
		WebElement target=driver.findElement(By.xpath("//*[text()=' Check e-mail']"));
	    Actions builder=new Actions(driver);
	    builder.dragAndDrop(source, target).build().perform();
	    //builder.dragAndDropBy(source, 30, 100).perform();
		
	}
}
