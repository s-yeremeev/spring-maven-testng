package com.beta.test.testng.page;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AbstractPage {
    protected ChromeDriver driver;
    protected String baseUrl;

//    @Value("${server.url}")//почему то не хавает
    private String startBaseUrl = "https://github.com";


    public AbstractPage(String baseUrl) {
        this.baseUrl = baseUrl;
        this.startBaseUrl = startBaseUrl;
    }

    public void open() {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get(this.startBaseUrl + this.baseUrl);
    }

    public AbstractPage() {
        this("");
        PageFactory.initElements(this.driver, this);
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getStartBaseUrl() {
        return this.startBaseUrl;
    }

    public void setStartBaseUrl(String startBaseUrl) {
        this.startBaseUrl = startBaseUrl;
    }
}
