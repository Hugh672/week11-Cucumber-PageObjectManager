package pageObjectManagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeePage {

	@FindBy(id = "menu_pim_addEmployee")
	private WebElement button;
	
	public void submitButton() {
		button.click();
	
	}
}
