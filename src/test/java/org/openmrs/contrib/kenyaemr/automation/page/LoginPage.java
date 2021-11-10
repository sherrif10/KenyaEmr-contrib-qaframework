package org.openmrs.contrib.kenyaemr.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class represents the Login page
 */
public class LoginPage extends Page {
	
	private final String LOGIN_PATH = "/login.htm";
	
	private final String MODULES_NOT_RUNNING_MESSAGE = "If you are seeing this page, it means that the OpenMRS Platform is running";
	
	private final String LOGOUT_PATH = "/logout";
	
	private final By FIELD_USERNAME = By.id("uname");
	
	private final By FIELD_PASSWORD = By.cssSelector("input[type=password]");
	
	private final By BUTTON_LOGIN = By.cssSelector("input[type=button]");
	
	private String username;
	
	private String password;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		username = properties.getUsername();
		password = properties.getPassword();
	}
	
	@Override
	public void go() {
		goToPage(LOGIN_PATH);
	}
	
	@Override
	public String getPageUrl() {
		return LOGIN_PATH;
	}
	
	@Override
	public String getPageRejectUrl() {
		return "index.htm";
	}
	
	public void enterUsername(String username) {
		setTextToFieldNoEnter(FIELD_USERNAME, username);
	}
	
	public void enterPassword(String password) {
		setTextToFieldNoEnter(FIELD_PASSWORD, password);
	}
	
	public void clickLoginButton() {
		clickOn(BUTTON_LOGIN);
	}
	
	public HomePage goToHomePage() {
		go();
		enterUsername(this.username);
		enterPassword(this.password);
		clickLoginButton();
		return new HomePage(this);
	}
	
	public HomePage goToHomePage(String userName, String password) {
		go();
		enterUsername(userName);
		enterPassword(password);
		clickLoginButton();
		return new HomePage(this);
	}
	
	public Boolean hasLoginButton() {
		return hasElement(BUTTON_LOGIN);
	}
}
