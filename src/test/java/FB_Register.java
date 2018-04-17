import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.List.*;
import java.util.Random;

import java.lang.String.*;

public class FB_Register extends Hooks
{
@Test
    public void register() throws InterruptedException
{
    driver.findElement(By.name("firstname")).sendKeys("Geeta");
    driver.findElement(By.name("lastname")).sendKeys("Nilla");
    Random r=new Random();
    int val=r.nextInt();
    driver.findElement(By.name("reg_email__")).sendKeys("kk.madhuri"+val+"@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("dheeran13");
    WebElement element=driver.findElement(By.id("day"));
    Select daydrop=new Select(element);
    daydrop.selectByVisibleText("10");
    Thread.sleep(1000);
    Select monthdrop=new Select(driver.findElement(By.id("month")));
    monthdrop.selectByVisibleText("Jan");
    Thread.sleep(1000);
    Select yeardrop=new Select(driver.findElement(By.id("year")));
    yeardrop.selectByVisibleText("1981");
    Thread.sleep(1000);
    List<WebElement> li=driver.findElements(By.name("sex"));
    li.get(1).click();

    Thread.sleep(4000);
    driver.findElement(By.name("websubmit")).click();
    Thread.sleep(5000);


}
}
