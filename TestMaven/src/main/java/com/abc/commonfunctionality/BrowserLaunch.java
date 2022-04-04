package com.abc.commonfunctionality;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//we are developing framework

public class BrowserLaunch {

		public void BrowserIntialisation(String Browsername,String url){
			if(Browsername.equalsIgnoreCase("chrome"))
			System.setProperty("webdriver.chrome.driver", "resources path");
			ChromeDriver obj=new ChromeDriver();
				}
		else (Browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "resources path");
			EdgeDriver obj=new EdgeDriver();
			

		}
		driver.get("url");

}
}