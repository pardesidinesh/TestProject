package services;
import org.openqa.selenium.WebDriver;  
    import org.openqa.selenium.firefox.FirefoxDriver;  
    public class openvaltech{  
     public static void main(String args[]){  
      WebDriver wb=new FirefoxDriver(); 
	wb.get("https://www.valtech.com/");
	wb.manage().window().maximize(); 
	wb.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div[2]/div/ul/li[2]/a/span")).click();
	Actualtext = driver.findElement(By.xpath("/html/body/div[1]/main/section/header/h1")).getText();
	Assert.assertEquals(Actualtext, "Services");
}
}