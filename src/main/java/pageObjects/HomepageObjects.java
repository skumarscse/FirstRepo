package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BasePage;

public class HomepageObjects extends BasePage {
	
	@FindBy (xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy (xpath="//div[@id='block_top_menu']/ul/li/a[text()='Dresses']")
	private WebElement dresses;
	
	@FindBy (xpath="//div[@id='block_top_menu']/ul/li/a[text()='T-shirts']")
	private WebElement tshirts;

	
	
	
	
	
	public HomepageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean iswomen() {
		return isElementVisible(women);
	}
	
	public boolean isdress() {
		return isElementVisible(dresses);
	}
	
	public boolean istshirt() {
		return isElementVisible(tshirts);
	}
	
	public void verifyitems(){
		System.out.println(women.isDisplayed());
		System.out.println(dresses.isDisplayed());
		System.out.println(tshirts.isDisplayed());
		System.out.println("Hello....");
		
	} 
}
