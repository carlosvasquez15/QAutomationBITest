package com.testbi.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Base {

	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.setDriver(driver);
		//this.wait = new WebDriverWait(driver, Duration.of(10, null));
	}
	
	public WebDriver chromeDriverConnection() {
		String sistemaOperativo;
		String rutaDriver = "";
		sistemaOperativo = System.getProperty("os.name").toLowerCase();
		
		if(sistemaOperativo.contains("win")) {
			rutaDriver = "path/chromedriver.exe";
		}else if (sistemaOperativo.contains("mac")) {
			rutaDriver = "/Users/carlos/Downloads/chromedriver_mac64/chromedriver";  
        }else {
        	rutaDriver = "/Users/carlos/Downloads/chromedriver_mac64/chromedriver";  
        }

		System.setProperty("webdriver.chrome.driver", rutaDriver);
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		setDriver(new ChromeDriver());
		return getDriver();
	}
	
	public WebElement findElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return getDriver().findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return getDriver().findElement(locator).getText();
	}
	
	public void escribir(String texto, By locator) {
		getDriver().findElement(locator).sendKeys(texto);
	}
	
	public void click(By locator) {
		getDriver().findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return getDriver().findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public void visitar(String url) {
		getDriver().get(url);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchTo(int index) {
        List<String> handles = new ArrayList<>(getDriver().getWindowHandles());
        if (index >= 0 && index < handles.size()) {
            getDriver().switchTo().window(handles.get(index));
        } else {
            throw new IllegalArgumentException("Invalid window index: " + index);
        }
    }
	
	/*public void waitForClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }*/
	
}
