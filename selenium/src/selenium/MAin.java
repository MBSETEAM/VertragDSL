package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zbozi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// Webseite aufrufen
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.check24.de/handyvertrag/samsung-galaxy-s8/?data_included=0&minutes_included=flatrate&hwprop_model=185&young_tariff=no&orderby=empfehlung_preis&hwprop_color=egal&hwprop_memorysize=egal");
		
		// load ajax
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (int i = 0; i < 10; i++) {
			Thread.sleep(500);
			jse.executeScript("window.scrollBy(0,8000)", "");
		}
		// Liste mit allen Containern mit der Klasse "ng-scope"
		List <WebElement> divClassProvider = driver.findElements(By.tagName("product-item"));
		
		System.out.println("Anzahl Verträge: "+divClassProvider.size());
		
		// Durchlaufe alle Listenelemente
		for(WebElement x : divClassProvider){
			WebElement provider = x.findElement(By.className("provider"));
			System.out.println(provider.findElement(By.xpath(".//img")).getAttribute("title"));
			System.out.println(provider.findElement(By.xpath(".//div[contains(@class, 'provider-name')]")).getText());
			System.out.println(provider.findElement(By.xpath(".//div[contains(@class, 'contract-period')]")).getText());
			System.out.println(x.findElement(By.xpath(".//span[contains(@class, 'name')]")).getText());
			System.out.println(x.findElement(By.xpath(".//div[contains(@class, 'traffic')]")).getText());
			String benefit_voice = x.findElement(By.xpath(".//div[contains(@class, 'voice')]")).getText().replaceAll("[\r\n]+", " ");
			System.out.println(benefit_voice);
			String benefit_sms = x.findElement(By.xpath(".//div[contains(@class, 'sms')]")).getText().replaceAll("[\r\n]+", " ");
			System.out.println(benefit_sms);
			System.out.println(x.findElement(By.xpath(".//div[contains(@class, 'price')]")).getText().split("\\€", 2)[0].replaceAll("[\r\n]+", " "));
			System.out.println();
		}
		
	}

}
