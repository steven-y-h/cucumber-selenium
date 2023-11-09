package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.pages.PageObject;

public class CucumberHook extends PageObject {
    @Before
    public void openBrowser() {
        initDriver();
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    /*@After(order=0)
    public void doSomethingAfter(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            driver.get("http://www.example.com");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("./image.png"));
        }
        *//*if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }*//*
    }*/
}
