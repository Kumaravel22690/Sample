package com.testsample.TestngSample;

public class LoginpageExecution extends PageLocators{
	public static void username() {
		BaseClass.sendKeys(BaseClass.findElementname(PageLocators.userName), "Kumara1234");
	}

	public static void password() {
		BaseClass.sendKeys(BaseClass.findElementBy(PageLocators.password), "Kumara@123");
	}

	public static void loginButton() {
		BaseClass.clickElement(BaseClass.findElementBy(PageLocators.loginButton));
	}
	public static void username2() {
		BaseClass.sendKeys(BaseClass.findElementname(PageLocators.userName), "Kumara");
	}

	public static void password2() {
		BaseClass.sendKeys(BaseClass.findElementBy(PageLocators.password), "kumara");
	}
	public static void loginButton2() {
		BaseClass.clickElement(BaseClass.findElementBy(PageLocators.loginButton));
	}
}

