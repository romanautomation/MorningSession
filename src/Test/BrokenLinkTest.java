package Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://138.197.213.237/auth-mvp-dev1/public/login?redirect_to=imagndev.com/home");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("eva@a.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of link & images "+linkList.size());
		
		List<WebElement> activeList = new ArrayList<WebElement>();
		
		for(int i=0; i<linkList.size();i++){
			
			System.out.println(linkList.get(i).getAttribute("href"));
			
			if(linkList.get(i).getAttribute("href")!=null && (!linkList.get(i).getAttribute("href").contains("javascript")) && (!linkList.get(i).getAttribute("href").contains("null")) && (linkList.get(i).getAttribute("href").contains(""))){
				activeList.add(linkList.get(i));
			}
		}
		
		System.out.println("Size of active link & images "+ activeList.size());
		
		// Check the URL, with httpconnetion API
		for(int j=0;j<activeList.size();j++){
			
			HttpURLConnection connection = (HttpURLConnection)new URL(activeList.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			
			String response = connection.getResponseMessage();
			
			System.out.println(activeList.get(j).getAttribute("href")+"---->"+response);
		}
	}

}
