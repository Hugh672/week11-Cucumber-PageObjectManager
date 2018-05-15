package pageObjectManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
		@FindBy(name = "txtUsername")
		private WebElement userTextbox;
		
		@FindBy(name = "txtPassword")
		private WebElement Password;
		
		@FindBy(name = "submit")
		private WebElement submit;
	
		
		public void enterUserName(String text) {
			userTextbox.sendKeys(text);
			userTextbox.submit();
		}
		
		public void enterUserPassword (String text) {
			Password.sendKeys(text);
			Password.submit();
		}
		
		public void submitButton() {
			submit.click();
		
		}
}













