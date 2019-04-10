package com.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CodeScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        Wait wait = new WebDriverWait(driver, 30);
        driver.get("https://codewithmosh.com/");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Login")));
        WebElement login = driver.findElement(By.linkText("Login"));
        login.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_email")));

        WebElement email = driver.findElement(By.id("user_email"));
        email.sendKeys("g.deepsingh1@gmail.com");
        WebElement pass = driver.findElement(By.id("user_password"));
        pass.sendKeys("ARIHANT");

    }
}
