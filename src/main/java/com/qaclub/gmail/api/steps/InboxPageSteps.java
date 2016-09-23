package com.qaclub.gmail.api.steps;

import com.qaclub.gmail.api.pages.InboxPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InboxPageSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 8271008333129837148L;

	public InboxPageSteps(Pages pages) {
		super(pages);
	}
	
	private InboxPage onInboxPage() {
		return pages().get(InboxPage.class);
	}
	
	@Step
	public void writeEmail(String to, String subject, String message) {
		onInboxPage().lightVersionLink.click();
		onInboxPage().composeLink.click();
		onInboxPage().toInput.sendKeys(to);
		onInboxPage().subjectInput.sendKeys(subject);
		onInboxPage().messageInput.sendKeys(message);
		onInboxPage().sendButton.click();
	}

}
