package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/EKTA/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
WebElement e1= driver.findElement(By.xpath("(/html/body/input)[1]"));
			//e1.sendKeys("Ekta");

	}

}
