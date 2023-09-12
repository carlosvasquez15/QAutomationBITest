package com.testbi.pom;

import org.junit.Test;
import org.openqa.selenium.By;

public class WebTablesTest {
	
	private Base base;

	public WebTablesTest(Base base) {
		super();
		this.base = base;
	}
	By elementsOption     = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elements'])[1]/preceding::*[name()='svg'][1]");
	By optionElement      = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web Tables'])[1]/preceding::*[name()='svg'][1]");
	By deleteButton       = By.cssSelector("#delete-record-1 > svg > path");		
	By addNewRecordButton = By.id("addNewRecordButton");
	
	By firstNameField     = By.id("firstName");
	By lastNameField      = By.id("lastName");
	By userEmailField     = By.id("userEmail");
	By ageField 		  = By.id("age");
	By salaryField        = By.id("salary");
	By departmentField    = By.id("department");
	
	By submitButton = By.id("submit");
	
	

	@Test
	public void test() throws InterruptedException {
		
		
		base.click(elementsOption);
		Thread.sleep(2000);
		base.hacerScrollHaciaAbajo();
		
		Thread.sleep(2000);
		
		base.click(optionElement);
	
		Thread.sleep(3000);
		
		base.click(deleteButton);
		
		Thread.sleep(2500);
		
		base.click(firstNameField);
		base.escribir("Juan", firstNameField);
		
		base.click(lastNameField);
		base.escribir("Perez", lastNameField);
		
		base.click(userEmailField);
		base.escribir("test@test.bi.com.gt", userEmailField);
		
		base.click(ageField);
		base.escribir("27", ageField);
		
		base.click(salaryField);
		base.escribir("8000", userEmailField);
		
		base.click(departmentField);
		base.escribir("Guatemala", userEmailField);
		
		base.hacerScrollHaciaAbajo();
		Thread.sleep(2000);
		
		
		base.click(submitButton);
		
	    Thread.sleep(4000);
	    
	    assert(true);
		
	}

}
