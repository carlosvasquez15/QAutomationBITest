package com.testbi.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestPage  extends Base{

	public TestPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String paginaPruebas = "https://demoqa.com/";
	//By moduloElement = By.linkText("Elements");
	
	
	public void test() throws InterruptedException {
		Thread.sleep(3500);
		//test5();
	    findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elements'])[1]/preceding::*[name()='svg'][1]")).click();
	    Thread.sleep(3000);
	    findElement(By.xpath("//li[@id='item-1']/span")).click();
	    Thread.sleep(3000);
	    findElement(By.className("rct-option-expand-all")).click();
	    
	    Thread.sleep(3000);
	    
	    findElement(By.cssSelector("label[for='tree-node-wordFile']")).click();
	    findElement(By.cssSelector("label[for='tree-node-excelFile']")).click();
		Thread.sleep(5000);
		
		//test2();
		//test3();
		//test4();
	}
	
	public void test2() throws InterruptedException {
		Thread.sleep(3500);
      
		findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dynamic Properties'])[1]/preceding::*[name()='svg'][1]")).click();
       
        //Espera a que pasen 5 segundos en lo que se activa el botón
		Thread.sleep(5500);
        findElement(By.id("enableAfter")).click();
        Thread.sleep(2500);
    }
	
	public void test3() throws InterruptedException {
		Thread.sleep(3500);
		findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Tables'])[1]/preceding::*[name()='svg'][1]")).click();
		Thread.sleep(2000);
		
		findElement(By.cssSelector("#delete-record-1 > svg > path")).click();
		Thread.sleep(2500);
		
	    findElement(By.id("addNewRecordButton")).click();
	    findElement(By.id("firstName")).click();
	    findElement(By.id("firstName")).clear();
	    findElement(By.id("firstName")).sendKeys("Juan");
	    findElement(By.id("lastName")).clear();
	    findElement(By.id("lastName")).sendKeys("Perez");
	    findElement(By.id("userEmail")).clear();
	    findElement(By.id("userEmail")).sendKeys("test@test.bi.com.gt");
	    findElement(By.id("age")).clear();
	    findElement(By.id("age")).sendKeys("27");
	    findElement(By.id("salary")).clear();
	    findElement(By.id("salary")).sendKeys("8000");
	    findElement(By.id("department")).clear();
	    findElement(By.id("department")).sendKeys("Guatemala");
	    Thread.sleep(2000);
	    findElement(By.id("submit")).click();
		Thread.sleep(5000);
	}
	
	public void test4()throws InterruptedException {
		Thread.sleep(3500);
		findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forms'])[1]/preceding::*[name()='svg'][1]")).click();
		Thread.sleep(2500);
	    visitar("https://demoqa.com/automation-practice-form");
	    Thread.sleep(2500);
	    findElement(By.id("firstName")).click();
	    findElement(By.id("firstName")).clear();
	    findElement(By.id("firstName")).sendKeys("Carlos");
	    findElement(By.id("lastName")).clear();
	    findElement(By.id("lastName")).sendKeys("Vasquez");
	    findElement(By.id("userEmail")).clear();
	    findElement(By.id("userEmail")).sendKeys("test@bi.com.gt");
	    findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div/label")).click();
	    findElement(By.id("userNumber")).click();
	    findElement(By.id("userNumber")).clear();
	    findElement(By.id("userNumber")).sendKeys("1234567890");
	    findElement(By.id("dateOfBirthInput")).click();
	    Thread.sleep(1500);
	    findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select")).click();
	    new Select(findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select"))).selectByVisibleText("1996");
	    Thread.sleep(1000);
	    findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select")).click();
	    new Select(findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select"))).selectByVisibleText("March");
	    Thread.sleep(1000);
	    findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]")).click();
	    findElement(By.xpath("//div[@id='subjectsContainer']/div/div")).click();
	    findElement(By.id("subjectsInput")).clear();
	    findElement(By.id("subjectsInput")).sendKeys("Maths");
	    Thread.sleep(1500);
	    
        By suggestionLocator = By.xpath("//div[@id='subjectsContainer']/div/div");
        Thread.sleep(1000);
        WebElement suggestion = findElement(suggestionLocator);
        suggestion.click();

	    findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label")).click();
	    findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
	    Thread.sleep(1000);
	    //findElement(By.id("uploadPicture")).click();
	    Thread.sleep(1000);
	    //findElement(By.id("uploadPicture")).clear();
	    findElement(By.id("uploadPicture")).sendKeys("/Users/carlos/Downloads/pruebas.rtf");
	    Thread.sleep(1000);
	    findElement(By.id("currentAddress")).click();
	    findElement(By.id("currentAddress")).clear();
	    Thread.sleep(1000);
	    findElement(By.id("currentAddress")).sendKeys("Banco Industrial zona 4. &a Avenida 5-10, zona 4 Centro Financiero Torre l");
	    findElement(By.id("state")).click();
	    Thread.sleep(1000);
	    findElement(By.id("react-select-3-option-0")).click();
	    findElement(By.id("city")).click();
	    Thread.sleep(1000);
	    findElement(By.id("react-select-4-option-0")).click();
	    findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
	    findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
	    Thread.sleep(1000);
	    findElement(By.id("currentAddress")).click();
	    Thread.sleep(2000);
	    findElement(By.id("userForm")).submit();
	    Thread.sleep(2500);
	    findElement(By.id("closeLargeModal")).click();
	    Thread.sleep(1500);
	}
	
	public void test5() throws InterruptedException {
		Thread.sleep(3000);
		visitar(paginaPruebas);
		Thread.sleep(2500);
		findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Book Store Application'])[1]/preceding::*[name()='svg'][1]")).click();
		Thread.sleep(3500);
	    findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div/div[6]/div/ul/li[2]")).click();
	    Thread.sleep(2000);
	    findElement(By.id("searchBox")).clear();
	    findElement(By.id("searchBox")).sendKeys("understanding");
	    Thread.sleep(2000);
	    findElement(By.linkText("Understanding ECMAScript 6")).click();
	    Thread.sleep(2000);
	    findElement(By.xpath("//div[@id='website-wrapper']/div[2]/label")).click();
	    Thread.sleep(3000);
	    switchTo(1);
	    getDriver().close();
	    switchTo(0);
	    visitar("https://demoqa.com/books?book=9781593277574");
	    Thread.sleep(3000);
	    findElement(By.id("addNewRecordButton")).click();
	    //visitar("https://demoqa.com/books");
	    Thread.sleep(5000);
	}
	
	
	
	public String testFinished() {
		return "Finalizado";
	}

}