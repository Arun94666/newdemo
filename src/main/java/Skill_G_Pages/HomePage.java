package Skill_G_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base_Libreary {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=SignIn)
	private WebElement signIn;
	
	@FindBy(xpath=emailBox)
	private WebElement emailField;
	
	@FindBy(xpath=passwordBox)
	private WebElement passwordField;
	
	@FindBy(xpath=submit)
	private WebElement submitButton;
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void signInWithCredentials(String email, String password) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		submitButton.click();
	}
}
