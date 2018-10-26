package br.com.spread.utils;

import static br.com.spread.utils.Constantes.URL_HOME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GerenciadorDriver {
	
	private static ChromeDriver driver;
	
	public static ChromeDriver getdriver() {
		if(driver == null) {
			System.setProperty("chromedriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;	
	}

	public static void abreNavegador() {
		getdriver();
		driver.get(URL_HOME);
	}

	public static void fechaNavegador() {
		if(driver!=null) {
			getdriver().close();
			getdriver().quit();
			driver=null;	
		}
	}
}
