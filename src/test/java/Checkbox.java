import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Checkbox extends Hooks {
    @Test
    public void checkBox() throws InterruptedException {
       // driver.findElement(By.id("bmwradio")).click();
        WebElement rbutton = driver.findElement(By.id("bmwradio"));
        rbutton.click();
        System.out.println("BMW radio button is" + rbutton.isSelected());
        Thread.sleep(2000);
        Select example = new Select(driver.findElement(By.id("carselect")));
        example.selectByVisibleText("Benz");
        Thread.sleep(1000);
        Select mtpleexample = new Select(driver.findElement(By.id("multiple-select-example")));
        mtpleexample.selectByVisibleText("Orange");
        Thread.sleep(1000);
        WebElement chkbtn = driver.findElement(By.id("bmwcheck"));
        chkbtn.click();
        WebElement chkbtnbenz = driver.findElement(By.id("benzcheck"));
        chkbtnbenz.click();
        Thread.sleep(2000);
        System.out.println("BMW check box is" + chkbtn.isSelected());
        System.out.println("Benz checkbox is" + chkbtnbenz.isSelected());
//    driver.close();
//    Thread.sleep(1000);
        //driver.findElement(By.name("name")).sendKeys("aki");
        driver.findElement(By.id("alertbtn")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(4000);
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        System.out.println("BMW check box is" + chkbtn.isSelected());
        Thread.sleep(4000);

    }

    @Test
    public void testNewWindow()  throws Exception {
        checkBox();
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.id("openwindow")).click();

        Thread.sleep(4000);

        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }

        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("$199"));
        driver.close();
        Thread.sleep(4000);
        driver.switchTo().window(winHandleBefore);
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Practice Page"));

    }
}
