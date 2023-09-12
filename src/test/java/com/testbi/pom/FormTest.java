package com.testbi.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormTest {
	
	private Base base;

	public FormTest(Base base) {
		this.base = base;
	}
	
	public void test() throws InterruptedException {
		System.out.println("Test FormTest");
		
		base.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forms'])[1]/preceding::*[name()='svg'][1]")).click();
		Thread.sleep(2500);
	    base.visitar("https://demoqa.com/automation-practice-form");
	    
	    Thread.sleep(2500);
	    base.findElement(By.id("firstName")).click();
	    base.findElement(By.id("firstName")).clear();
	    base.findElement(By.id("firstName")).sendKeys("Carlos");
	    base.findElement(By.id("lastName")).clear();
	    base.findElement(By.id("lastName")).sendKeys("Vasquez");
	    base.findElement(By.id("userEmail")).clear();
	    base.findElement(By.id("userEmail")).sendKeys("test@bi.com.gt");
	    base.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div/label")).click();
	    base.findElement(By.id("userNumber")).click();
	    base.findElement(By.id("userNumber")).clear();
	    base.findElement(By.id("userNumber")).sendKeys("1234567890");
	    base.findElement(By.id("dateOfBirthInput")).click();
	    Thread.sleep(1500);
	    base.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select")).click();
	    new Select(base.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select"))).selectByVisibleText("1996");
	    Thread.sleep(1000);
	    base.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select")).click();
	    new Select(base.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select"))).selectByVisibleText("March");
	    Thread.sleep(1000);
	    base.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]")).click();
	    base.findElement(By.xpath("//div[@id='subjectsContainer']/div/div")).click();
	    base.findElement(By.id("subjectsInput")).clear();
	    base.findElement(By.id("subjectsInput")).sendKeys("Maths");
	    
	    base.getDriver().findElement(By.id("subjectsInput")).sendKeys(Keys.RETURN);
	    
	    base.findElement(By.id("subjectsInput")).sendKeys("S");
	    
	    base.getDriver().findElement(By.id("subjectsInput")).sendKeys(Keys.RETURN);
	    
	    
	    Thread.sleep(3000);
	    
	    base.getDriver().findElement(By.id("subjectsInput")).sendKeys(Keys.BACK_SPACE);
	    
	    Thread.sleep(5000);
	    
        By suggestionLocator = By.xpath("//div[@id='subjectsContainer']/div/div");
        Thread.sleep(1000);
        WebElement suggestion = base.findElement(suggestionLocator);
        suggestion.click();

        base.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label")).click();
        base.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
	    Thread.sleep(1000);
	    //findElement(By.id("uploadPicture")).click();
	    Thread.sleep(1000);
	    //findElement(By.id("uploadPicture")).clear();
	    base.findElement(By.id("uploadPicture")).sendKeys("/Users/carlos/Downloads/pruebas.rtf");
	    Thread.sleep(1000);
	    base.findElement(By.id("currentAddress")).click();
	    base.findElement(By.id("currentAddress")).clear();
	    Thread.sleep(1000);
	    base.findElement(By.id("currentAddress")).sendKeys("Banco Industrial zona 4. &a Avenida 5-10, zona 4 Centro Financiero Torre l");
	    base.findElement(By.id("state")).click();
	    Thread.sleep(1000);
	    base.findElement(By.id("react-select-3-option-0")).click();
	    base.findElement(By.id("city")).click();
	    Thread.sleep(1000);
	    base.findElement(By.id("react-select-4-option-0")).click();
	    base.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
	    base.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
	    Thread.sleep(1000);
	    base.findElement(By.id("currentAddress")).click();
	    Thread.sleep(2000);
	    base.findElement(By.id("userForm")).submit();
	    Thread.sleep(2500);
	    base.findElement(By.id("closeLargeModal")).click();
	    Thread.sleep(1500);
		
		
		Thread.sleep(2000);		
		assert(true);
	}

}
