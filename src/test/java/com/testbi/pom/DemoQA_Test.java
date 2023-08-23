package com.testbi.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class DemoQA_Test {
	private WebDriver driver;
	TestPage paginaAProbar;
	
	@Before
	public void setUp() {
		paginaAProbar = new TestPage(driver);
		driver = paginaAProbar.chromeDriverConnection();
		paginaAProbar.visitar("https://demoqa.com/");
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		paginaAProbar.test();
		paginaAProbar.test2();
		paginaAProbar.test3();
		paginaAProbar.test4();
		paginaAProbar.test5();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
