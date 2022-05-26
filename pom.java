# practicemore
package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip                            //here mouse actios are performed

{
 public static void main(String[] args) throws InterruptedException
 {
   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   Thread.sleep(4000);
   
   driver.navigate().to("https://demoqa.com/droppable/");
   Thread.sleep(5000);
   driver.manage().window().maximize();
   Thread.sleep(4000);
   
   WebElement me=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
   //me.click();
   Thread.sleep(4000);
   WebElement here=driver.findElement(By.xpath("//*[@id=\'droppable\']"));
   //here.click();
   
   Actions ver=new Actions(driver);
   Thread.sleep(4000);
     
   ver.dragAndDrop(me, here).build().perform();
   
   
   
   
   
   //driver.navigate().to("https://www.flipkart.com");
    
   
  // driver.navigate().to("http://www.facebook.com");
   Thread.sleep(5000);
   //WebElement log=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
   WebElement sign =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
   Actions act= new Actions(driver);
   act.moveToElement(sign).contextClick().build().perform();   
   
   Thread.sleep(4000);
   WebElement fc= driver.findElement(By.className("_8eso"));
   Actions act1=new Actions(driver);
   act1.moveToElement(fc).doubleClick().build().perform();
   act1.moveToElement(fc).contextClick().build().perform();
   Thread.sleep(6000);
   WebElement sign1 =driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
   WebElement mail=driver.findElement(By.name("email"));
   Actions act2=new Actions(driver);
   act2.moveToElement(sign1).dragAndDrop(sign1, mail).build().perform(); 
   
   
   
   
  // log.sendKeys("7972613498");
  // Thread.sleep(4000);
   
   ////input[@class='_2IX_2- _3mctLh VJZDxU']
   //WebElement pw= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
   //pw.sendKeys("9420330381");
   //Thread.sleep(4000);
   
   //WebElement submit=driver.findElement(By.xpath("//span[@text='login']"));
   //boolean result=submit.isEnabled();
   //if(result==true)
   //{
	 //  submit.click();
   }
   
}
