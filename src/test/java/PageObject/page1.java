package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class page1 {

	public WebDriver driver;
	WebDriverWait lwait;
	public page1(WebDriver ldriver,WebDriverWait wait) {
		
		driver=ldriver;
		lwait=wait;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy(xpath="//a[@href='/flights']")
	WebElement filght;
	
	public void Click_Flight() {
		
		lwait.until(ExpectedConditions.elementToBeClickable(filght));
		filght.click();
		
		
		}
	
	////
	@FindBy(xpath="//div[contains(@id,'origin-airport-display')]")
	WebElement dept_airport;
	
	
	@FindBy(id="ap-SJC")
	WebElement origin;
//	title-section
	
	@FindBy(xpath="//section[@class='title-section']")
	WebElement section;
	
	@FindBy(xpath="//div[contains(text(),'New Delhi, India')]")
	WebElement mydest;
	
	//@FindBy(xpath="/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]/*[local-name()='svg'][1]")
	//WebElement selClose;
	@FindBy(xpath="//div[@data-placeholder='To?' and @aria-label='Flight destination input']")
	WebElement dest;
	
	@FindBy(xpath="//input[contains(@id,'destination-airport') and @name='destination' and @placeholder='To?']")
	WebElement destAirport;
	
	////
	public void Click_OriginAndDestination() throws Exception {
		
		lwait.until(ExpectedConditions.elementToBeClickable(dept_airport));
		dept_airport.click();
		//driver.switchTo().activeElement();
		//selClose.click();
		lwait.until(ExpectedConditions.elementToBeClickable(origin));
		origin.click();
		
		
		Thread.sleep(3000);
		
		section.click();
		
		
		
		
		lwait.until(ExpectedConditions.elementToBeClickable(dest));
		dest.click();
		Thread.sleep(3000);
		
		
		destAirport.sendKeys("i");
		Thread.sleep(3000);
		mydest.click();
		Thread.sleep(3000);
		section.click();

		}
	
	
	@FindBy(xpath="//div[@class='_iaf _iEc _ia1 _i7r _iv1 _j0z _iPK _j0x _j0B _iai']")
	WebElement deptDate;
	
	@FindBy(xpath="//div[@data-val='1598857200000']")
	WebElement date1;
	
	@FindBy(xpath="//div[@class='_iaf _iEc _ia1 _i7r _iv1 _j0z _iPK _j0x js-date-end _iai']")
	WebElement retdate;
	@FindBy(xpath="//div[@data-val='1601017200000']")
	WebElement date2;
	public void enterDates() throws Exception {
		
		lwait.until(ExpectedConditions.elementToBeClickable(deptDate));
		deptDate.click();
		
		Thread.sleep(3000);
		date1.click();
		
		Thread.sleep(3000);
		section.click();
		Thread.sleep(3000);
		retdate.click();
		Thread.sleep(3000);
		date2.click();
		}
	@FindBy(xpath="//span[contains(@class,'v-c-p centre')]//span[contains(@class,'icon')]//*[local-name()='svg']")
	WebElement search;
	
	////
	@FindBy(xpath="//button[contains(@id,'close-button')]")
	WebElement popup;
	
	public void search() throws Exception {
		
		lwait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		popup.click();
		
		
		}
	
	
	@FindBy(xpath="//div[@class='js-selection _iaf _idA _idj _iai _ia4 _iiM _ibc _ia2 _ia- _ia7 _im4 _iac _ioQ _idf _idG _ixV _ixW _h-- _iaA _ibz _irF _iQe _ic2 _ibH _igO _kaH _ia3 _ia6 _j0 _Hn _ibb _jT _kaK _jU _ia9 _jZ _jY']//div[@class='js-selection-display _id7 _ii0 _iir _ic1 _ic0 _iUb _kaL'][contains(text(),'San Jose (SJC)')]")
	WebElement searchO;
	
	
	@FindBy(xpath="//div[contains(@id,'destination-airport-display-multi-container')]")
	WebElement searchD;
	
//	@FindBy(xpath="div[contains(@id,'-origin-airport-display-multi-container')]//div[@role='listitem']")
//	WebElement list;
//	
	//////
	@FindBy(xpath="//div[contains(@id,'origin-airport-display-multi-container')]")
	WebElement org;
	
	@FindBy(xpath="//div[contains(@id,'origin-airport-smarty-window')]//li[1]")
	WebElement item1;
//	@FindBy(xpath="div[contains(@id,'origin-airport-smarty-window')]//li[2]")
//	WebElement item2;
	public void validate() throws Exception {
		
		Thread.sleep(3000);
		
		String de=searchD.getText();
		
		System.out.println("passed 2   "+de);
		Assert.assertEquals("New Delhi (DEL)", de);
		Thread.sleep(3000);
		System.out.println(org.getText());
		
		String s=org.getText();
		s = s. replaceAll("\\s",""); 
		System.out.println(s);
		Assert.assertEquals("SFOSJC",s);
	}
}
