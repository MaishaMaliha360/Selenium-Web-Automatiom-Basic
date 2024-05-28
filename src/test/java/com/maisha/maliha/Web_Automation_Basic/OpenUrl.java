package com.maisha.maliha.Web_Automation_Basic;

import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	
	@Test
	public void open() throws InterruptedException {
	    driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
	}
	
	

}
