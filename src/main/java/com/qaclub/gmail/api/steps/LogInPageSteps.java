package com.qaclub.gmail.api.steps;

import com.qaclub.gmail.api.pages.LogInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class LogInPageSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = -7779410152049141383L;

	public LogInPageSteps(Pages pages) {
		super(pages);
	}
	
	private LogInPage onLoginPage() {		
		return pages().get(LogInPage.class);		
	}
	
	@Step
	public void logIn(String email, String password) {
		onLoginPage().loginInput.sendKeys(email);
		onLoginPage().passwordInput.sendKeys(password);
		onLoginPage().sublitButton.click();
	}
}
