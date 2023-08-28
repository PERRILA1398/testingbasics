package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils
{
 public String BrowserName = "Chrome";
    public void OpenBrowser ()
    {

        if (BrowserName.equalsIgnoreCase("Chrome"))
    {
        driver = new ChromeDriver();
    } else if (BrowserName.equalsIgnoreCase("FireFox"))
    {
        driver= new FirefoxDriver();
    }else if (BrowserName.equalsIgnoreCase("Edge")){
        driver = new EdgeDriver();
    }

        driver.get("https://www.kivue.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public void CloseBrowser ()
    {
        driver.close();
    }
}
