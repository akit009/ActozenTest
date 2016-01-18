package AppointmentBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class For_New_User {
	static WebDriver driver;
	@Test
    public static void ConsultNowTest(){
	driver=Driver.getDriver();
    driver.manage().window().maximize();
    driver.get(Constant.URL);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[@href='#consult']"));
    Select sel=new Select(driver.findElement(By.xpath("//select[@name='c4']")));
    sel.selectByVisibleText("Surgeon");
    Select sel1=new Select(driver.findElement(By.xpath("//select[@name='c6']")));
    sel1.selectByVisibleText("Delhi - NCR");
    driver.findElement(By.xpath("//span[text()='Consult']")).click();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //driver.findElement(By.xpath("//a[@href='/doctor/100']")).click();
    	
    
    
    //hhjjhghjhjgj
    	
   
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.findElement(By.xpath(Constant.Time)).click();
    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    Select sel2= new Select(driver.findElement(By.xpath("//select[@id='c14']")));
    sel2.selectByVisibleText("Ms.");
    driver.findElement(By.xpath("//input[@id='c15']")).sendKeys("Ankit");
    driver.findElement(By.xpath("//input[@id='c16']")).sendKeys("23");
    driver.findElement(By.xpath("//input[@id='c17']")).sendKeys("");
    driver.findElement(By.xpath("//input[@id='c18']")).sendKeys("mohmayatyago.00.9@gmail.com");
    driver.findElement(By.xpath("//button[text()='Book Appointment']")).click();
    driver.close();
}
	

}
