package com.qaclub.gmail.api.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

@FindBy(xpath = ".//*[@class='new-left']")
public class LogInPage extends PageObject {
	
	public LogInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@name='login']")
	public WebElement loginInput;
	
	@FindBy(xpath = ".//*[@name='passwd']")
	public WebElement passwordInput;
	
	@FindBy(xpath = ".//*[@type = 'submit']")
	public WebElement sublitButton;

}
