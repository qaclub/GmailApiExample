package com.qaclub.gmail.api.steps;

import java.io.IOException;
import com.qaclub.gmail.api.GetEmailsFromGmail;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.assertEquals;

public class CommonSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 7066411787291300070L;

	public CommonSteps(Pages pages) {
		super(pages);
	}	
	
	@Step
	public void navigateTo(String url) {
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}
	
	@Step
	public String getMessage() throws IOException {
		String result = GetEmailsFromGmail.getMessage().getSnippet();
		
		return result;
	}
	
	@Step
	public void makeAsRead() throws IOException {
		GetEmailsFromGmail.makeAsRead();
	}
	
	@Step
	public void getParts() throws IOException {
		GetEmailsFromGmail.getInviteURL();
	}
	
	@Step
	public void verifyThatSnippetIsOk(String snippet) {
		assertEquals("This is test message from QA Club GFL", snippet);
	}

	

}
