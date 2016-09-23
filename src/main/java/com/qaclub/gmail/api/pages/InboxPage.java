package com.qaclub.gmail.api.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class InboxPage extends PageObject {
	
	public InboxPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Light version']")
	public WebElement lightVersionLink;
	
	@FindBy(xpath = "//i[text()='Compose']")
	public WebElement composeLink;
	
	@FindBy(xpath = ".//*[@name='to']")
	public WebElement toInput;
	
	@FindBy(xpath = ".//*[@name='subj']")
	public WebElement subjectInput;
	
	@FindBy(xpath = ".//*[@name='send']")
	public WebElement messageInput;
	
	@FindBy(xpath = ".//*[@name='doit']")
	public WebElement sendButton;	

}
