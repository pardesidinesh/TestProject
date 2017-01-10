package latestnews;
import org.openqa.selenium.WebDriver;  
    import org.openqa.selenium.firefox.FirefoxDriver;  
    public class openvaltech{  
     public static void main(String args[]){  
      WebDriver wb=new FirefoxDriver(); 
	wb.get("https://www.valtech.com/");
	wb.manage().window().maximize(); 
	Actualtext = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/aside/header/h2")).getText();
	Assert.assertEquals(Actualtext, "Case Studies");
}
}