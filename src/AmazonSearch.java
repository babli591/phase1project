import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Connection;
import java.sql.DriverManager;



import java.sql.*;

public class AmazonSearch {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        /*Opening website www.amazon.in */
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver wb = new ChromeDriver();
        wb.get("https://www.amazon.in");

        wb.manage().window().maximize();
//      wb.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);

        /* Search Product */
        wb.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pet food");
        wb.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        /* Extracting data */

        WebElement pname=wb.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/h2/a/span"));
        System.out.println(pname.getText());
        WebElement pprice=wb.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[3]/div/a/span[1]/span[2]/span[2]"));
        System.out.println(pprice.getText());
        WebElement ddate=wb.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[4]/div/div[1]/span/span[2]"));
        System.out.println(ddate.getText());


    }
    }



