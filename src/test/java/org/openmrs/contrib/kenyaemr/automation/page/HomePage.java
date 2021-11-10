package org.openmrs.contrib.kenyaemr.automation.page;

import org.openqa.selenium.By;

/**
 * This class represents the Home page
 */
public class HomePage extends Page {
	
	private final By LINK_LOGOUT = By.className("logout");
	private final String PATH_HOME_RESET = "referenceapplication/home.page?noredirect=true";
	private final By FIELD_OLD_PASSWORD = By.xpath("//input[@id='oldPassword-field']");
	private final By FIELD_NEW_PASSWORD = By.xpath("//input[@id='newPassword-field']");
	private final By FIELD_CONFIRM_PASSWORD = By.xpath("//input[@id='confirmPassword-field']");
	private static final By SAVE_BUTTON = By.id("save-button");
	private final String PATH_HOME = "/referenceapplication/home.page";
	private static final By FIND_PATIENT_RECORD = By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension");
	private static final By DATA_MANAGEMENT = By.cssSelector("#coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension");
	private final By APP_REGISTER_PATIENT = By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension");
	private final By APP_SYSTEM_ADMIN = By.id("coreapps-systemadministration-homepageLink-coreapps-systemadministration-homepageLink-extension");
	private final By REPORTS_MANAGEMENT = By .cssSelector("#reportingui-reports-homepagelink-reportingui-reports-homepagelink-extension");
	
	public HomePage(Page page) {
		super(page);
	}
	
	@Override
	public String getPageUrl() {
		return PATH_HOME;
	}
	
	public String getPageUrlReset() {
		return PATH_HOME_RESET;
	}
	
	public Boolean hasLogOutLink() {
		return hasElement(LINK_LOGOUT);
	}
	
	public void clickLogout() {
		goToPage("appui/header/logout.action?successUrl=openmrs");
	}
	
	public RegisterPatientPage clickRegisterPatientApp() {
		clickOn(APP_REGISTER_PATIENT);
		return new RegisterPatientPage(this);
	}
	
	public FindPatientPage clickOnSearchPatientRecord() {
		clickOn(FIND_PATIENT_RECORD);
		return new FindPatientPage(this);
	}
	
	public SystemAdministrationPage clickSystemAdministrationApp() {
		clickOn(APP_SYSTEM_ADMIN);
		return new SystemAdministrationPage(this);
	}
	
	public void enterOldPassword(String oldPassword) {
		setText(FIELD_OLD_PASSWORD, oldPassword);
	}
	
	public void enterNewPassword(String newPassword) {
		setText(FIELD_NEW_PASSWORD, newPassword);
	}
	
	public void confirmNewPassword(String confirmPassword) {
		setText(FIELD_CONFIRM_PASSWORD, confirmPassword);
	}
	
	public ReportsPage clickOnReportsApp() {
		clickOn(REPORTS_MANAGEMENT);
		return new ReportsPage(this);
		
	}
	
	public DataManagementPage clickOnDataManagementPage() {
		clickOn(DATA_MANAGEMENT);
		return new DataManagementPage(this);
	}
	
	public String savePassword() {
		clickOn(SAVE_BUTTON);
		return "index.html";
	}
	
}
