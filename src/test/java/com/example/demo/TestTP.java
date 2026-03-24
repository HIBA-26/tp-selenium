package com.example.demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;




public class TestTP {
    private WebDriver driver;

    @BeforeMethod
    public void setupTest() {
        this.driver = new ChromeDriver();
    }

    @Test
    public void testSQLI() {

        driver.get("https://www.sqli.com");

        String title = driver.getTitle();

        // Vérifier que le titre contient SQLI
        assertTrue(title.toLowerCase().contains("sqli"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
