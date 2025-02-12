/* Decompiler 6ms, total 722ms, lines 44 */
package selenium;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
   public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.get("https://www.google.co.in/");
      String url = driver.getCurrentUrl();
      System.out.println(url);
      String title = driver.getTitle();
      System.out.println(title);
      String source = driver.getPageSource();
      driver.navigate().refresh();
      driver.navigate().to("https://desicrew.in/");
      System.out.println(driver.getCurrentUrl());
      driver.navigate().back();
      driver.navigate().forward();
      Thread.sleep(4000L);
      String singlewindow = driver.getWindowHandle();
      System.out.println(singlewindow);
      driver.navigate().to("https://demo.automationtesting.in/Windows.html");
      driver.findElement(By.xpath("(//button[@class='btn btn-info'][normalize-space()='click'])[1]")).click();
      Set<String> child = driver.getWindowHandles();
      ArrayList<String> al = new ArrayList(child);
      driver.switchTo().window((String)al.get(1));
      Set<String> child1 = driver.getWindowHandles();
      System.out.println(child1);
      System.out.println(driver.getCurrentUrl());
      driver.switchTo().window((String)al.get(0));
      driver.close();
      driver.switchTo().window((String)al.get(1));
      Thread.sleep(4000L);
      driver.manage().window().minimize();
      driver.quit();
   }
}
