package ru.gov.osm;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class First {
    @Test
    public void firstTes() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\javaworkplace\\Selenium\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://osm.gov.ru/portal/home?3");
        WebElement element = driver.findElement(By.xpath("//a[@class='user-link ui-button ui-corner-all ui-widget']"));
        element.click();
        WebElement element1 = driver.findElement(By.xpath("//a[@class='btn-danger service-get-btn']"));
        element1.click();

        //Сайт не успевает подгужаться
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){
        }

        WebElement element_face = driver.findElement(By.xpath("//span[@class='option-pseudo']"));
        element_face.click();

        try {
            Thread.sleep(1000);
        }
        catch (Exception e){
        }

        WebElement element_surname = driver.findElement(By.xpath("//input[@class='form-control']"));
        element_surname.sendKeys("Ничепорнко");
        WebElement element_name = driver.findElement(By.xpath("//input[@id='id7a']"));
        element_name.sendKeys("Олег");
        WebElement element_patronymic = driver.findElement(By.xpath("//input[@id='id7b']"));
        element_patronymic.sendKeys("Васильевич");
        WebElement element_data = driver.findElement(By.xpath("//input[@class='form-control hasDatepicker']"));
        element_data.sendKeys("12.12.1992");//7
        WebElement element_place = driver.findElement(By.xpath("//input[@id='id84']"));
        element_place.sendKeys("Москва");
        WebElement element_adr1 = driver.findElement(By.xpath("//label[@class='option-custom m-column m-midst']"));
        element_adr1.click();
        WebElement element_email = driver.findElement(By.xpath("//input[@id='id7f']"));
        element_email.sendKeys("Oleg_1992@lbl.ml");

        driver.quit();
    }
}
