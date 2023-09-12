package com.testbi.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DemoQA_Test {	
	private Base base;
	
	private CheckBoxTest checkBoxPage;
	private DynamicProperties dynamicProperties;
	private WebTablesTest webTablesTest;
	private FormTest formPage;

	
	@Before
	public void setUp() {
		base = new Base();
		base.getDriver().manage().window().maximize();
		base.visitar("https://demoqa.com/");
	}
	
	@Test
	public void test1() throws InterruptedException {
		checkBoxPage = new CheckBoxTest(this.base);		
		checkBoxPage.test();
	}
	
	@Test
	public void test2() throws InterruptedException {
		dynamicProperties = new DynamicProperties(this.base);
		dynamicProperties.test();
	}
	
	@Test
	public void test3() throws InterruptedException {
		webTablesTest = new WebTablesTest(this.base);
		webTablesTest.test();
	}
	
	@Test
	public void test4() throws InterruptedException {
		formPage = new FormTest(this.base);
		formPage.test();
	}
		
	
	@After
	public void tearDown() {
		base.getDriver().quit();
	}
	
}
