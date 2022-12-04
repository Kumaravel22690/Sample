package com.testsample.TestngSample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class PageExecution extends LoginpageExecution {
	

	@BeforeSuite
	public void start() {
		BaseClass.browserlaunch();
		System.out.println("test b4 Started");
	}

	@BeforeClass
	public void browser() {
		BaseClass.maxmizeScreen();
	}

	@BeforeMethod
	public void beforeMethod() {
		BaseClass.launchUrl("https://adactinhotelapp.com/");
	}

	@Test
	public void valid() {
		username();
		password();
		loginButton();
	}

	@Test
	public void invalid() {
		username2();
		password2();
		loginButton2();
	}
	@AfterMethod
	public void afterClass() {
		System.out.println("After Method");
	}

	@AfterClass
	public void close() {
		BaseClass.browserClose();
	}

	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}

	@AfterSuite
	public void completed() {
		System.out.println("Test Completed");
	}
}