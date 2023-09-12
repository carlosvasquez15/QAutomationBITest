package com.testbi.pom;

import org.openqa.selenium.By;

public class DynamicProperties {
	
	private Base base;

	public DynamicProperties(Base base) {
		this.base = base;
	}
	
	By elementsOption  = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Elements'])[1]/preceding::*[name()='svg'][1]");
	By dinamyc  = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dynamic Properties'])[1]/preceding::*[name()='svg'][1]");
	By buttonEnable = By.id("enableAfter");
	
	public void test() throws InterruptedException {
		System.out.println("Test DynamicProperties");
		
		base.click(elementsOption);
		Thread.sleep(4000);
		base.hacerScrollHaciaAbajo();
		
		base.click(dinamyc);		
		Thread.sleep(5500);
				
        base.click(buttonEnable);
        Thread.sleep(4000);
        
        if(buttonEnable == null) {
        	assert(false);
        }else {        
        	assert(true);
        }
	}	

}
