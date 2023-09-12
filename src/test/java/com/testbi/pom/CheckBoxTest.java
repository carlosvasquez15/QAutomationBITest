package com.testbi.pom;

import org.openqa.selenium.By;

public class CheckBoxTest{
	
	private Base base;

	public CheckBoxTest(Base base) {
		this.base = base;
	}
	
	By elementsOption  = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elements'])[1]/preceding::*[name()='svg'][1]");
	By checkBoxElement = By.xpath("//li[@id='item-1']/span");
	By expandElement   = By.className("rct-option-expand-all");
	
	By wordFileElement  = By.cssSelector("label[for='tree-node-wordFile']");
	By excelFileElement = By.cssSelector("label[for='tree-node-excelFile']");
	
	
	public void test() throws InterruptedException {
		System.out.println("Test CheckBoxTest");
		
		base.click(elementsOption);		
	    Thread.sleep(1000);
	    
	    base.click(checkBoxElement);	    
	    Thread.sleep(1000);
	    
	    base.click(expandElement);	    
	    Thread.sleep(1000);
	    
	    base.click(wordFileElement);
	    base.click(excelFileElement);
	    
		Thread.sleep(2000);		
		assert(true);
	}
	
		
	

}
