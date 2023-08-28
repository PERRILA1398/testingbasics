package org.example;

public class BaseTest extends Utils
{

    DriverManager driverManager = new DriverManager();

    public void Setup ()
    {
        driverManager.OpenBrowser();
    }

    public void Teardown ()
    {
        driverManager.CloseBrowser();
    }
}

