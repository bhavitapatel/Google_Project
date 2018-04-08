package FreeCrm.Login;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementByName("email").sendKeys("bhavita14@hotmail.com");
		driver.findElementByXPath("//*[@id=\"loginForm\"]/div/input[2]");
	}

}
