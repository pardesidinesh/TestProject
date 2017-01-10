package contactus;
 
public class getvaltechoffices{
 
	public static void main(String[] args) {
		WebDriver wb= new FirefoxDriver();
		wb.get("https://www.valtech.com/");
 		wb.findElement(by.xpath("/html/body/div[1]/header/div/nav/div/div[1]/label[1]/div/a/div/div/div[1]/i")).click();
		java.util.List<WebElement> links = wb.findElements(By.tagName("h3"));
		System.out.println(links.size());
		for (int i = 1; i<=links.size(); i=i+1)
		{
			System.out.println(links.get(i).getText());
		}
 
	}
 
}