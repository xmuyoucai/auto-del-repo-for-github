package com.zyloops.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author lzy
 * @version 1.0
 * @description
 * @date 2019/8/13 11:34
 **/
public class GithubChromeSelenium {

    private WebDriver driver;

    public GithubChromeSelenium(String path) {
        System.setProperty("webdriver.chrome.driver", path);
        this.driver = new ChromeDriver();
    }

    public void login(String user, String pass) {
        driver.get("https://github.com/login");
        WebElement txtUser = driver.findElement(By.id("login_field"));
        txtUser.sendKeys(user);
        WebElement txtPass = driver.findElement(By.id("password"));
        txtPass.sendKeys(pass);
        WebElement btnLog = driver.findElement(By.xpath("//input[@class=\"btn btn-primary btn-block\"]"));
        btnLog.click();
    }

    public void delete(String repo) {
        driver.get("https://github.com/xmuyoucai/" + repo + "/settings");
        WebElement deleteBtn = driver.findElement(By.xpath("//summary[@aria-haspopup=\"dialog\"][contains(text(), \"Delete this repository\")]"));
        deleteBtn.click();
        WebElement confirmTxt = driver.findElement(By.xpath("//input[@aria-label=\"Type in the name of the repository to confirm that you want to delete this repository.\"]"));
        confirmTxt.sendKeys(repo);
        WebElement deleteConfirmBtn = driver.findElement(By.xpath("//button[contains(text(), \"I understand the consequences, delete this repository\")]"));
        deleteConfirmBtn.click();
        System.out.println("deleted : " + repo);
    }

    public void close() {
        driver.close();
    }

}
