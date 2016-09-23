package com.qaclub.gmail.api.tests;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.qaclub.gmail.api.steps.CommonSteps;
import com.qaclub.gmail.api.steps.InboxPageSteps;
import com.qaclub.gmail.api.steps.LogInPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SendEmailFromYandexMailTest {
	
	@Managed
	private WebDriver driver;
	
	@Steps
	LogInPageSteps logIn;
	
	@Steps
	InboxPageSteps inbox;
	
	@Steps
	CommonSteps common;
	
	private final String email = "qateam.example@yandex.com";
	private final String password = "temp123";
	private final String to = "alexeylabaf@gmail.com";
	private final String subject = "This is test subject";
	private final String message = "This is test message from QA Club GFL";
	private final String url = "https://mail.yandex.ua";
	
	@Before
	public void setUp() {
		common.navigateTo(url);
	}
	
	@Test
	public void runSendEmailFromYandexMailTest() throws IOException {		
		logIn.logIn(email, password);
		inbox.writeEmail(to, subject, message);
		String result = common.getMessage();
		common.makeAsRead();
		common.verifyThatSnippetIsOk(result);
	}

}
