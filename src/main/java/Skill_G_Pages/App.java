package Skill_G_Pages;

import org.openqa.selenium.support.PageFactory;


public class App extends Base_Libreary{
	
	
	public App()
	{
		PageFactory.initElements(driver, this);
	}

	
}